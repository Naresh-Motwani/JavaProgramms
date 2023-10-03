package Collection_Programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapWithOutGeneric {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(101, "Naresh");
		map.put(102, "Rahul");
		map.put(103, "Mehta");
		map.put(104, "JD");

		Set set = map.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
