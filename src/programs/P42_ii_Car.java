package programs;

public class P42_ii_Car extends P42_i_Vehicle {

	public static void main(String[] args) {

		P42_ii_Car car = new P42_ii_Car();
		car.brandString = "Maruti Suzuki";
		car.modelString = "Baleno";
		car.colourString = "Blue";
		car.numberString = "RJ45-AB-1234";

		System.out.println("I have " + car.brandString + " " + car.modelString + " " + car.colourString
				+ " and number is " + car.numberString);

		car.start("SelfStart");
		car.maxSpeed(240);
	}
}