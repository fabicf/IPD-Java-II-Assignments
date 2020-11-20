
public class Assign5 {

	public static void main(String[] args) {
		Dancer fabi = new Dancer(21, "fabi");
		EletricBoogieDancer fabi1 = new EletricBoogieDancer(23, "myDancer");
		Brakdancer fabi2 = new Brakdancer(25, "yourDancer");

		Dancer[] dancerArray = new Dancer[] { fabi, fabi1, fabi2 };

		for (int i = 0; i < dancerArray.length; i++) {

			dancerArray[i].dance();
		}

	}

}
