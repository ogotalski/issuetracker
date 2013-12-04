package org.training.issuetracker.beans;

import java.util.List;
import java.util.ArrayList;

public class Project {
	private String name;
	private String description;
	private List<String> builds;
	private User Manager;
	public Project(String name, String description, String build, User manager) {
		super();
		this.name = name;
		this.description = description;
		this.builds = new ArrayList<String>(); 
					builds.add(build);
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
	public List<String> getBuilds() {
		return builds;
	}
	public void addBuild(String build) {
		this.builds.add(build);
	}
	public User getManager() {
		return Manager;
	}
	public void setManager(User manager) {
		Manager = manager;
	}
	
	
	
}
