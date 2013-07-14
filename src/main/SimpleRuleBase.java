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
		System.out.println("****************************");
		System.out.println("Here are the loaded rules:");
		for (ECARule rule: rules) {
			System.out.println("Event: " + rule.getEvent());
			System.out.println("Condition: " + rule.getCondition());
			System.out.println("Action: " + rule.getAction());
		}
		System.out.println("******************************");
	}

	@Override
	public List<ECARule> getRulesForEvent(ECAEvent event) {
		List<ECARule> result = new ArrayList<>();
		for (ECARule rule: rules) {
			if (rule.getEvent().equals(event.getDescription())) {
				result.add(rule);
			}
		}
		return result;
	}

}
