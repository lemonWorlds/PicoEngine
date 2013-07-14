package main;

import interfaces.EventHandler;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RuleParser parser = new SimpleRuleParser("H:\\newWorkspace\\PicoEngine\\src\\main\\rules.xml");
		RuleBase base = new SimpleRuleBase();
		parser.getRules(base);
		base.printRules();
		ECAEvent event1 = new SimpleECAEvent("Update");
		ECAEvent event2 = new SimpleECAEvent("Delete");
		ECAEvent event3 = new SimpleECAEvent("Update");
		ECAEvent event4 = new SimpleECAEvent("Create");
		ConditionEvaluator eval = new ConditionEvaluator();
		EventHandler handler = new SimpleECAEventHandler(base, eval);
		handler.handle(event1);
		handler.handle(event2);
		handler.handle(event3);
		handler.handle(event4);
	}

}
