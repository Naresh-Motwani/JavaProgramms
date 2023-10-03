package programs;

public class P41_Car {

	public static void main(String[] args) {
		P41_Car car = new P41_Car();
		car.color("White");
		car.speed(200);
	}

	private void speed(int maxSpeed) {
		System.out.println("Car Max Speed is : " + maxSpeed + "Km/Hr");

	}

	private void color(String colourString) {
		System.out.println("Car colour is : " + colourString);
	}

}