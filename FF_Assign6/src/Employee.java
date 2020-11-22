
public class Employee {

	protected String name;
	protected String ssn;

	// constructor
	public Employee(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	// toString
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + "]";
	}
	// method salary
	public double salary() {
		return 1000;// to be edited
	}

	

}
