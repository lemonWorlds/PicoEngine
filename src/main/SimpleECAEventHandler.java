package main;

import java.util.List;

import interfaces.EventHandler;

public class SimpleECAEventHandler implements EventHandler {

	private RuleBase base = null;
	private ConditionEvaluator eval = null;
	
	public SimpleECAEventHandler(RuleBase base,ConditionEvaluator eval) {
		this.base = base;
		this.eval = eval;
	}
	
	@Override
	public void handle(ECAEvent event) {
		List<ECARule> rules = base.getRulesForEvent(event);
		eval.evaluateRules(rules);
	}

}
