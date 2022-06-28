package com.myspace.kbs_happydonia.activityissues;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LowReactionIssue implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int communicationStrategyId;

	private int activityId;

	public LowReactionIssue() {
	}

	public int getCommunicationStrategyId() {
		return this.communicationStrategyId;
	}

	public void setCommunicationStrategyId(int communicationStrategyId) {
		this.communicationStrategyId = communicationStrategyId;
	}

	public int getActivityId() {
		return this.activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public LowReactionIssue(int activityId, int communicationStrategyId) {
		this.activityId = activityId;
		this.communicationStrategyId = communicationStrategyId;
	}

}