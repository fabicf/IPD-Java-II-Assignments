import java.time.LocalDate;

public class User implements Comparable<User> {

	private int id;
	private String name;
	private java.time.LocalDate birthDate;

	// constructor
	public User(int id, String name, LocalDate birthDate) {

		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.time.LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.time.LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

	// sort by name

	public int compareTo(User o) {
		return this.name.compareTo(o.name);
	}

//	// sort by id
//	public int compareTo1(User o) {
//		if (this.id == o.id) {
//			return 0;
//		} else if (id < o.id) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

}
