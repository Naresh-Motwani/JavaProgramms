package programs;

public class P40_MyMain {

	public static void main(String[] args) {

		myStaticMethod();

		P40_MyMain myMain = new P40_MyMain();
		myMain.myPublicMethod();

	}

	private void myPublicMethod() {
		System.out.println("This is public method and print after object create");
	}

	private static void myStaticMethod() {
		System.out.println("This is static method and print without create object");
	}

}
