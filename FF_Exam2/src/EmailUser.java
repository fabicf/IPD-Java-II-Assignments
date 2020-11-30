
public class EmailUser extends User{
	String emailAddress;

	//constructor
	public EmailUser(String firstName, String lastName, Address address, String emailAddress) {
		super(firstName, lastName, address);
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
