package expriment;

public class Car extends Vehicle {

	public Car(int maxspeed) {
		super(maxspeed);
	}

	@Override
	void colour() {
		System.out.println("Red");
	}

	@Override
	void speed() {
		System.out.println(maxspeed);
	}

	public static void main(String[] args) {

		Vehicle vehicle = new Car(25);

		vehicle.colour();
		vehicle.speed();

	}

}
