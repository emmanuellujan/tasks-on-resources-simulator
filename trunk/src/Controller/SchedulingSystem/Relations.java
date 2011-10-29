package Controller.SchedulingSystem;

import java.util.Hashtable;
import java.util.Vector;

public class Relations {
	
	private Hashtable<Object, Object> properties;
	private Vector<Resource> resources;

	public Relations() {
	}
	
	public Object getProperty(Object key) {
		return properties.get(key);
	}

	public void setProperty(Object key, Object value) {
		this.properties.put(key, value);
	}

	public Vector<Resource> getResources() {
		return resources;
	}

	public void setResources(Vector<Resource> resources) {
		this.resources = resources;
	}
}