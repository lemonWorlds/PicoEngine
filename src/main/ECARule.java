/**
 * 
 */
package main;

/**
 * @author tohaga01
 * 
 * Encapsulates rule data
 */
public interface ECARule {
	String getEvent();
	String getCondition();
	String getAction();
}
