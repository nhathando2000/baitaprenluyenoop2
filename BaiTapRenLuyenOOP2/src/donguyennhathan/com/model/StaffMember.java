package donguyennhathan.com.model;

public abstract class StaffMember {
	protected String name;
	protected String adress;
	protected String phone;
	
	public StaffMember() {
		super();
	}
	public StaffMember(String name, String adress, String phone) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return this.name+"-"+this.adress+"-"+this.phone;
	}
	public abstract double pay();
}
