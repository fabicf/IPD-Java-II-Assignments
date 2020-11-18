/*Fabiola Faria
Exam 1 Answers:
1. b - Constructor;
2. c - Use abstraction whenever possible to avoid duplication;
3. c - true


3. a - false --> must be the first statement in a constructor,
3. b - false
3. c - true
3. d - false 
3. e - false
3. f - false

*/

public class Exam1 {

	public static void main(String[] args) {

		// 4 - Carpet Cost Calculator
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("total = " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("total = " + calculator.getTotalCost());

		// 5 - Banking
		// Please see classes Bank, BankA, BankB, BankC
		BankA myBankA = new BankA();
		System.out.println(myBankA.getBalance());
		BankB myBankB = new BankB();
		System.out.println(myBankB.getBalance());
		BankC myBankC = new BankC();
		System.out.println(myBankC.getBalance());
		

		// 6 - PC
		CaseDimension dimensions = new CaseDimension(20, 20, 5);
		PcCase theCase = new PcCase("220B", "Dell", "240", dimensions);

		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		Pc thePC = new Pc(theCase, theMonitor, theMotherboard);
		thePC.getPcCase().pressPowerButton();

	}

}
