package org.training.issuetracker.beans;

public class Project {
	private String name;
	private String description;
	private String build;
	private User Manager;
	public Project(String name, String description, String build, User manager) {
		super();
		this.name = name;
		this.description = description;
		this.build = build;
		Manager = manager;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public User getManager() {
		return Manager;
	}
	public void setManager(User manager) {
		Manager = manager;
	}
	
	
	
}
