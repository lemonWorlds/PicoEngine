package main;

import interfaces.ActionScheduler;

public class SimpleActionScheduler implements ActionScheduler {
	private EventHandler handler = null;
	
	public SimpleActionScheduler(EventHandler handler) {
		this.handler = handler;
	}
	
	@Override
	public void scheduleAction(ECARule rule) {
		String action = rule.getAction();
		if (!action.equals("Update")) {
			ECAEvent event = new SimpleECAEvent(action);
			handler
		}
		System.out.println("Action: " + rule.getAction());
	}

}
