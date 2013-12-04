package org.training.issuetracker.beans;

import java.util.Set;

public class Resolution extends issueProperty {
	private static Set<Resolution> resolutions;

	public static Set<Resolution> getResolutions() {
		return resolutions;
	}

	public Resolution(String name,int id) {
		super(name,id);
	}
	protected void addToSet() {
		resolutions.add(this);
	}
}
