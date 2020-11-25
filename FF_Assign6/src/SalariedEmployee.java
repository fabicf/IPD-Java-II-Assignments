
public class SalariedEmployee extends Employee {

	protected double basicSalary;

	// constructor
	public SalariedEmployee(String name, String ssn, double basicSalary) {
		super(name, ssn);
		this.basicSalary = basicSalary;
	}

	// method salary
	@Override
	public double salary() {
		return basicSalary;
	}

	// toString
	@Override
	public String toString() {
		return "SalariedEmployee [basicSalary=" + basicSalary + ", name=" + name + ", ssn=" + ssn + ", salary()="
				+ salary() + "]";
		

	}

	

}
