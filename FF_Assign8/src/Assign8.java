import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Assign8 {

	public static void writeToFile(ArrayList<String> fileList) throws IOException {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/resource/testfile1"))) {
			for (int i = 0; i < fileList.size(); i++) {
				writer.write(fileList.get(i) + " \n");

			}
		}

	}

	public static ArrayList<String> readFromFile() throws IOException {
		ArrayList<String> al1 = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new FileReader("src/resource/testfile1"))) {

			Stream<String> lines = reader.lines();
			lines.forEach(line -> al1.add(line));

		} catch (IOException e) {
			throw e;
		}
		return al1;
	}

	public static void main(String[] args) throws IOException {
		Address a1 = new Address(34, "Main Street", "Montreal", "QC", "H21 1H1");
		Address a2 = new Address(52, "Left Street", "Laval", "QC", "H22 4H5");
		Address a3 = new Address(13, "Right Street", "Montreal", "QC", "H2F 3K5");
		Address a4 = new Address(22, "Coast Street", "West Island", "QC", "H5G 3L4");
		Address a5 = new Address(99, "Down Street", "Montreal", "QC", "H2J 9F5");

		ArrayList<String> myList = new ArrayList<String>();
		myList.add(a1.toString());
		myList.add(a2.toString());
		myList.add(a3.toString());
		myList.add(a4.toString());
		myList.add(a5.toString());

		writeToFile(myList);
		
		myList = readFromFile();
		
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		
	}

}
