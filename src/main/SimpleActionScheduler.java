package main;

import interfaces.ActionScheduler;

public class SimpleActionScheduler implements ActionScheduler {

	@Override
	public void scheduleAction(ECARule rule) {
		System.out.println("Action: " + rule.getAction());
	}

}
