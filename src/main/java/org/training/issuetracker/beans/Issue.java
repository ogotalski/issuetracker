package org.training.issuetracker.beans;

import java.util.Date;

public class Issue {
	private String summary;
	private String description;
	private issueProperty status;
	private Type type;
	private Priority priority;
	private String build;
	private User assignee;
	private Resolution resolution;
	private Date createDate;
	private User createUser;
	private Date modifyDate;
	private User modifyUser;
	
}
