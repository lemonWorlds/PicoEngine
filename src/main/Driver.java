package main;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RuleParser parser = new SimpleRuleParser("H:\\newWorkspace\\PicoEngine\\src\\main\\rules.xml");
		RuleBase base = new SimpleRuleBase();
		parser.getRules(base);
		base.printRules();
	}

}
