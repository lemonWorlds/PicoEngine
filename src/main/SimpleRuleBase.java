package main;

import java.util.List;
import java.util.ArrayList;

public class SimpleRuleBase implements RuleBase {
	private List<ECARule> rules = new ArrayList<>();

	@Override
	public void addRule(ECARule rule) {
		rules.add(rule);
	}
	
	public void printRules() {
		for (ECARule rule: rules) {
			System.out.println("Event: " + rule.getEvent());
			System.out.println("Condition: " + rule.getCondition());
			System.out.println("Action: " + rule.getAction());
		}
	}

}
