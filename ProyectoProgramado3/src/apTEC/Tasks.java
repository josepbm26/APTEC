package apTEC;

//creating the tasks class
public class Tasks {
	//attributes
	private int ID;
	private String description;
	private String effort;
	private String responsable;
	
	//constructor
	public Tasks(int ID,String description,String effort,String responsable) {
		setID(ID);
		setDescription(description);
		setEffort(effort);
		setResponsable(responsable);
	}
	
	//methods of the class
	//SETS
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setEffort(String effort) {
		this.effort = effort;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
	//GETS
	public int getID() {
		return ID;
	}
	public String getDescription() {
		return description;
	}
	public String getEffort() {
		return effort;
	}
	public String getResponsable() {
		return responsable;
	}
	
}
