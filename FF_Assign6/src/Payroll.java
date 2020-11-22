
public class Payroll {

	protected Employee[] employee;

	// constructor
	public Payroll(Employee[] employee) {
		this.employee = employee;
	}
	// method paySalary
	public void paySalary() {
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}
	}

}
