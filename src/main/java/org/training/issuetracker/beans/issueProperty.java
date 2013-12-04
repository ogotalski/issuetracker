package org.training.issuetracker.beans;

import org.training.issuetracker.idaos.IPropertyDAO;

public abstract class issueProperty {

	private String name;
	private int id;
    
	protected abstract void addToSet();
	
	public void init(IPropertyDAO dao){
		issueProperty property = dao.read();
		while (property != null){
			property.addToSet();
			property = dao.read();
		}
	}
	
	public issueProperty(String name, int id) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		issueProperty other = (issueProperty) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

}