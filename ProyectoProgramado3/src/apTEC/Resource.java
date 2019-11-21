package apTEC;

public class Resource {

	String ID;
	String name;
	String type;
	String capacity;
	String quantity;
	String inCharge;
	
	public Resource(String ID,String name,String type,String capacity,String quantity,String inCharge) {
		setID(ID);
		setName(name);
		setType(type);
		setCapacity(capacity);
		setQuantity(quantity);
		setInCharge(inCharge);
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getInCharge() {
		return inCharge;
	}

	public void setInCharge(String inCharge) {
		this.inCharge = inCharge;
	}
	

	
}
