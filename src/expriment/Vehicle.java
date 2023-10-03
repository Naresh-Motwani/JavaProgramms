package expriment;

public abstract class Vehicle {
	
	public Vehicle(int maxspeed) {
		super();
		this.maxspeed = maxspeed;
	}

	int maxspeed;
	
	abstract void colour();

	abstract void speed();

	void brand() {
		System.out.println("BMW");
	}

}
