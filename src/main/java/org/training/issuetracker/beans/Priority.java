package org.training.issuetracker.beans;

import java.util.Set;

public class Priority extends issueProperty {
	private static Set<Priority> priorities;

	public static Set<Priority> getPriorities() {
		return priorities;
	}

	public Priority(String name,int id) {
		super(name,id);
	}
	protected void addToSet() {
		priorities.add(this);
	}
}
