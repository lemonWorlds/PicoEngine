package main;

public class SimpleECAEvent implements ECAEvent {
	private String event = null;
	
	public SimpleECAEvent(String event) {
		this.event = event;
	}

	@Override
	public String getDescription() {
		return event;
	}

}
