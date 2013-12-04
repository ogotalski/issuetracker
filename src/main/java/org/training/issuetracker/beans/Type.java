package org.training.issuetracker.beans;

import java.util.Set;

public class Type extends issueProperty {
	private static Set<Type> types;

	public static Set<Type> getTypes() {
		return types;
	}

	public Type(String name,int id) {
		super(name,id);
	}

	@Override
	protected void addToSet() {
		types.add(this);
	}

}
