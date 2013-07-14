package main;

import java.util.List;

public class ConditionEvaluator {
	
	private int numberOfEvals = 0;
	public void evaluateRules(List<ECARule> rules) {
		System.out.println("******************************");
		System.out.println("Eval no." + (++numberOfEvals));
		for (ECARule rule: rules) {
			System.out.println("Condition:" + rule.getCondition());
		}
		System.out.println("******************************");
	}
	
}
