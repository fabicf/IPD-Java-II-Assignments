import java.util.Comparator;

public class BirthDateComparator implements Comparator<User> {


	@Override
	public int compare(User o1, User o2) {
		if (o1.getBirthDate().isEqual(o2.getBirthDate())){
			return 0;
		}
		else if (o1.getBirthDate().isAfter(o2.getBirthDate())) { //If you wish sort in a decreasing way, use .isBefore()
			return 1;
		}
		else {
			return -1;
		}
	}

}
