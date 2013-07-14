/**
 * 
 */
package main;

/**
 * @author tohaga01
 * 
 * Encapsulates rule data.
 *
 */
public class SimpleECARule implements ECARule {
	
	private String event = null;
	private String condition = null;
	private String action = null;
	
	public SimpleECARule(String event, String condition, String action) {
		this.event = event;
		this.condition = condition;
		this.action = action;
	}

	/* (non-Javadoc)
	 * @see main.ECARule#getEvent()
	 */
	@Override
	public String getEvent() {
		return event;
	}

	/* (non-Javadoc)
	 * @see main.ECARule#getCondition()
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/* (non-Javadoc)
	 * @see main.ECARule#getAction()
	 */
	@Override
	public String getAction() {
		return action;
	}

}
