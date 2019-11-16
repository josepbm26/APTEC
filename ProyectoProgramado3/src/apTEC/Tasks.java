package apTEC;

//creating the tasks class
public class Tasks {
	//attributes
	private String name;
	private int ID;
	private String description;
	private String type;
	private String effort;
	private String responsable;
	
	//constructor
	public Tasks(String name,int ID,String description,String type,String effort,String responsable) {
		setName(name);
		setID(ID);
		setDescription(description);
		setType(type);
		setEffort(effort);
		setResponsable(responsable);
	}
	
	//methods of the class
	//SETS
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setEffort(String effort) {
		this.effort = effort;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
	//GETS
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
	public String getDescription() {
		return description;
	}
	public String getType() {
		return type;
	}
	public String getEffort() {
		return effort;
	}
	public String getResponsable() {
		return responsable;
	}
	
	//toString method
	public String toString() {
		return "Task Info:\nName: "+name+"\nID: "+ID+"\nDescription: "+description+"\nType: "+type+"\nEffort: "+effort+"\nResponsable: "+responsable;
	}
}
