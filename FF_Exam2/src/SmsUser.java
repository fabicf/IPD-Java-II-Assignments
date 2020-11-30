
public class SmsUser extends User {
	String phoneNumber;

	//constructor
	public SmsUser(String firstName, String lastName, Address address, String phoneNumber) {
		super(firstName, lastName, address);
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	//add 9 digits validation
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.matches("^[0-9]")) {
		this.phoneNumber = phoneNumber;
		}else {
			throw new IllegalArgumentException("The phone number must contains only digits");
		}
		
	}
	
	
	

}
