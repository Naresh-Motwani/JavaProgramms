package programs;

public class P42_iii_Bike extends P42_i_Vehicle {

	public static void main(String[] args) {

		P42_i_Vehicle bike = new P42_iii_Bike();
		bike.brandString = "Royal Enfield";
		bike.modelString = "Meteor 350 Stellar";
		bike.colourString = "Pure Black";
		bike.numberString = "RJ14-AB-1234";

		System.out.println("I have " + bike.brandString + " " + bike.modelString + " " + bike.colourString
				+ " and number is" + bike.numberString);

		bike.start("SelfStartButton");
		bike.maxSpeed(160);

	}
}