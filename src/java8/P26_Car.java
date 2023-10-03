package java8;

public class P26_Car implements P26_Vehicle {

	@Override
	public void brand() {
		System.out.println("Brand of car is BMW ");
	}

	@Override
	public String speedUp() {
		return "Speed Up";
	}

	public static void main(String[] args) {

		P26_Vehicle vehicle = new P26_Car();

		vehicle.brand();

		System.out.println(vehicle.speedUp());

		System.out.println(vehicle.speedDown());

		System.out.println(P26_Vehicle.maxSpeed());
	}

}
