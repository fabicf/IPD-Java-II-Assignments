
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComissionEmployee myEmployee1 = new ComissionEmployee("John", "Deer", 2000, 0.15);
		HourlyEmployee myEmployee2 = new HourlyEmployee("Jason", "Lee", 20, 15);
		SalariedEmployee myEmployee3 = new SalariedEmployee("Arnold", "Schwaz", 300);

		Employee[] employee = new Employee[] { myEmployee1, myEmployee2, myEmployee3 };

		Payroll p1 = new Payroll(employee);
		p1.paySalary();
		// System.out.println(myEmployee1);
		// System.out.println(myEmployee2);
		// System.out.println(myEmployee3);
		// System.out.println();

	}

}
