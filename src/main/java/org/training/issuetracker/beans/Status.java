package org.training.issuetracker.beans;

import java.util.Set;

public class Status extends issueProperty {
	private static Set<Status> statuses;

	public static Set<Status> getStatuses() {
		return statuses;
	}

	public Status(String name,int id) {
		super(name,id);
	}
	protected void addToSet() {
		statuses.add(this);
	}
}
