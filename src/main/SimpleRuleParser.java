package main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class SimpleRuleParser implements RuleParser {
	private Document document = null;
	
	public SimpleRuleParser(String filename) {
		try {
			File file = new File(filename);
			DocumentBuilderFactory  factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.parse(file);
			document.getDocumentElement().normalize();
		} catch (Exception ex) {
			System.out.println("There was a problem setting up the parser.");
			System.exit(1);
		}
	}

	@Override
	public void getRules(RuleBase base) {
		NodeList nodes = document.getElementsByTagName("rule");
		for (int i = 0; i < nodes.getLength(); i++) {
			Element element = (Element) nodes.item(i);
			String event = element.getElementsByTagName("event").item(0).getTextContent();
			String condition = element.getElementsByTagName("condition").item(0).getTextContent();
			String action = element.getElementsByTagName("action").item(0).getTextContent();
			ECARule rule = new SimpleECARule(event, condition, action);
			base.addRule(rule);
		}
	}

}
