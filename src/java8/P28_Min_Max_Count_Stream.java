package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class P28_Min_Max_Count_Stream {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		nameList.add("Naresh");
		nameList.add("Rahul");
		nameList.add("Mehta");
		nameList.add("Zuber");
		nameList.add("Lokesh");
		nameList.add("Ishani");

		long count = nameList.stream().count();
		System.out.println("Number of element's ==>> " + count);
		Optional<String> findFirst = nameList.stream().findFirst();
		Optional<String> min = nameList.stream().min((o1, o2) -> o1.compareTo(o2));
		Optional<String> max = nameList.stream().max((o1, o2) -> o1.compareTo(o2));

		System.out.println("First element is " + findFirst + " and minimum " + min + " maxmimum is " + max);

	}

}
