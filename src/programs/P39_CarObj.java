package programs;

public class P39_CarObj {

	String colourString = "Red";

	void start() {
		System.out.println("Car Start ");
	}

	public static void main(String[] args) {

		P39_CarObj carObj = new P39_CarObj();
		carObj.start();
		carObj.colourString = "White";
		System.out.println("Car Colour is: " + carObj.colourString);
		System.out.println("-------------------");
		P39_CarObj carObj2 = new P39_CarObj();
		carObj2.start();
		System.out.println("Car Colour is: " + carObj2.colourString);
	}
}