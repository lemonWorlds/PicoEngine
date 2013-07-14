package main;

import interfaces.ActionScheduler;

import java.util.List;

public class ConditionEvaluator {
	private DataSet data = null;
	private ActionScheduler scheduler = null;
	public ConditionEvaluator(DataSet data,ActionScheduler scheduler) {
		this.data = data;
		this.scheduler = scheduler;
	}
	
	public void evaluateRules(List<ECARule> rules) {
		for (ECARule rule: rules) {
			boolean noAction = false;
			boolean condition = false;
			String[] words = rule.getCondition().split("\\s+");
			int value = Integer.parseInt(words[2]);
			int dataValue = 0;
			switch (words[0]) {
				case "mean":
					dataValue = data.getMean();
					break;
				case "median":
					dataValue = data.getMedian();
					break;
				case "mode":
					dataValue = data.getMode();
					break;
				case "deviation":
					dataValue = data.getDeviation();
					break;
				default:
					noAction = true;
			}
			if (!noAction) {
				if (words[1].equals(">")) {
					condition = (dataValue > value);
				} else if (words[1].equals("<")) {
					condition = (dataValue < value);
				} else if (words[1].equals("=")) {
					condition = (dataValue == value);
				}
				if (condition) {
					scheduler.scheduleAction(rule);
				}
			}
			
		}
	}
	
}
