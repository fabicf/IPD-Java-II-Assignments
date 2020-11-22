
public class HourlyEmployee extends Employee {

	protected double wage;
	protected double hours;

	// constructor
	public HourlyEmployee(String name, String ssn, double wage, double hours) {
		super(name, ssn);
		this.wage = wage;
		this.hours = hours;
	}

	// method salary
	@Override
	public double salary() {
		return wage * hours;
	}

	// toString
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", name=" + name + ", ssn=" + ssn + ", salary()="
				+ salary() + "]";
	}

}
