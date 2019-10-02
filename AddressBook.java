public class AddressBook {
	private String firstname;
	private String lastname;
	private String streetaddress;
	private String state;
	private String country;
	private String telNo;
	private String email;
	

	public AddressBook() {
		firstname = "";
		lastname = "";
		streetaddress = "";
		state = "";
		country = "";
		telNo = "";
		email = "";
	}

	public AddressBook(String firstname, String lastname, String streetaddress, String state, String country, String telNo, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.streetaddress = streetaddress;
		this.state = state;
		this.country = country;
		this.telNo = telNo;
		this.email = email;
	}

	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public void setStreetAddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String getStreetAddress() {
		return streetaddress;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getTelNo() {
		return telNo;
	}
	public String getEmail() {
		return email;
	}
}