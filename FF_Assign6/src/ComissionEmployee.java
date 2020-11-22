
public class ComissionEmployee extends Employee {

	protected double sales;
	protected double comission;

	// constructor
	public ComissionEmployee(String name, String ssn, double sales, double comission) {
		super(name, ssn);
		this.sales = sales;
		this.comission = comission;
	}

	// method salary
	@Override
	public double salary() {
		return super.salary() + (comission * sales);
	}

	// toString
	@Override
	public String toString() {
		return "ComissionEmployee [sales=" + sales + ", comission=" + comission + ", name=" + name + ", ssn=" + ssn
				+ ", salary()=" + salary() + "]";
	}

}
