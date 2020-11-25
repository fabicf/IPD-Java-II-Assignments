import java.time.LocalDate;

public class User {

	private int id;
	private String name;
	private java.time.LocalDate birthDate;
	
	//constructor
	public User(int id, String name, LocalDate birthDate) {

		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	//toString
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	

}
