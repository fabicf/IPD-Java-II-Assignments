import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;

public class Assign7 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(1999, 05, 12);
		LocalDate date2 = LocalDate.of(1998, Month.AUGUST, 22);
		LocalDate date3 = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate date4 = LocalDate.of(1995, 06, 15);
		LocalDate date5 = LocalDate.of(2015, Month.APRIL, 22);

		User u1 = new User(4521, "John", date1);
		User u2 = new User(4519, "Julia", date2);
		User u3 = new User(4520, "Edw", date3);
		User u4 = new User(4522, "Ashley", date4);
		User u5 = new User(4518, "Cameron", date5);

		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);

		for (User myUser : userList) {
			System.out.println(myUser);

		}
		
		System.out.println("sort by name using comparable");
		
		Collections.sort(userList);
		
		for (User myUser : userList) {
			System.out.println(myUser);

		}
		
		Collections.sort(userList);
		
		
		System.out.println("==============");
		
		//sort by id
		userList.forEach(u -> System.out.println(u));
		Collections.sort(userList, new IdComparator());
		System.out.println("sort by Id using comparator");
		userList.forEach(u -> System.out.println(u));

	}

}
