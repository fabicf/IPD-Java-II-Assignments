import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;

public class Assign7 {

	public static void main(String[] args) {

		// First, instantiating dates
		LocalDate date1 = LocalDate.of(1999, 05, 12);
		LocalDate date2 = LocalDate.of(1998, Month.AUGUST, 22);
		LocalDate date3 = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate date4 = LocalDate.of(1995, 06, 15);
		LocalDate date5 = LocalDate.of(2015, Month.APRIL, 22);

		// Second, instantiating users with id, name and date
		User u1 = new User(4521, "John", date1);
		User u2 = new User(4519, "Joey", date2);
		User u3 = new User(4520, "Eddy", date3);
		User u4 = new User(4522, "Lucy", date4);
		User u5 = new User(4518, "Anna", date5);

		// Adding users in a array
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);

		// Printing the Array list
		for (User myUser : userList) {
			System.out.println(myUser);
		}

		// Sorting by name - using comparable
		System.out.println("Sorting by name - Using comparable ");
		// Implementing Collections sort - it makes the sort
		Collections.sort(userList);
		// Printing to see the collections sort results
		for (User myUser : userList) {
			System.out.println(myUser);
		}

		// Printing to skip line
		System.out.println();

		// Sorting by Id - Using comparator
		// Print myUser list before sort
		userList.forEach(myUser -> System.out.println(myUser));
		// Implementing Sort by Id - Using comparator (IdComparator Class)
		Collections.sort(userList, new IdComparator());
		System.out.println("Sorting by Id - Using comparator");
		// Printing after sort by Id
		userList.forEach(myUser -> System.out.println(myUser));

		// Printing to skip line
		System.out.println();

		// Sorting by BirthDate - Using comparator
		// Print myUser list before sort
		userList.forEach(myUser -> System.out.println(myUser));
		// Implementing Sort by BirthDate - Using comparator (BirthDateComparator Class)
		Collections.sort(userList, new BirthDateComparator());
		System.out.println("sort by BirthDate - Using comparator");
		// Printing after sort by BirthDate
		userList.forEach(myUser -> System.out.println(myUser));
	}

}
