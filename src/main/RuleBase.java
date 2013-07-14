package main;

import java.util.List;

public interface RuleBase {
	void addRule(ECARule rule);	
	void printRules();
	List<ECARule> getRulesForEvent(ECAEvent event);
}
