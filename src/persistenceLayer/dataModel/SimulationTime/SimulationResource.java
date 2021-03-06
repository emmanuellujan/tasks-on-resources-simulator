package persistenceLayer.dataModel.SimulationTime;

import java.util.Hashtable;
import java.util.Vector;

import logicLayer.schedulingSystem.Resource;

public class SimulationResource {
	private String resId;

	private int nbrOfPropChanges;
	private Hashtable<String, String> properties;
	private Vector<String> relationsIds;
	private int resourceMaxLimit;

	SimulationResource(Resource resource) {
		String resId = resource.getResId();
		int nbrOfPropChanges = resource.getNbrOfPropChanges();
		Hashtable<String, String> properties = (Hashtable<String, String>) resource
				.getProperties().clone();
		Vector<String> relationsIds = (Vector<String>) resource
				.getRelationsIds().clone();
		int resourceMaxLimit = resource.getResourceMaxLimit();

		this.setResId(resId);
		this.setNbrOfPropChanges(nbrOfPropChanges);
		this.setProperties(properties);
		this.setRelationsIds(relationsIds);
		this.setResourceMaxLimit(resourceMaxLimit);
	}

	public int getNbrOfPropChanges() {
		return nbrOfPropChanges;
	}

	public Hashtable<String, String> getProperties() {
		return properties;
	}

	public Vector<String> getRelationsIds() {
		return relationsIds;
	}

	public String getResId() {
		return resId;
	}

	public int getResourceMaxLimit() {
		return resourceMaxLimit;
	}

	public void setNbrOfPropChanges(int nbrOfPropChanges) {
		this.nbrOfPropChanges = nbrOfPropChanges;
	}

	public void setProperties(Hashtable<String, String> properties) {
		this.properties = properties;
	}

	public void setRelationsIds(Vector<String> relationsIds) {
		this.relationsIds = relationsIds;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public void setResourceMaxLimit(int resourceMaxLimit) {
		this.resourceMaxLimit = resourceMaxLimit;
	}

}
