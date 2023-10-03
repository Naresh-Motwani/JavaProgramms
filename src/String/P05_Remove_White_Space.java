package String;

public class P05_Remove_White_Space {

	public static void main(String[] args) {

		String name = "My Name is Naresh Motwani";

		name = name.replaceAll("\\s+", "");
		System.out.println(name);

	}

}
