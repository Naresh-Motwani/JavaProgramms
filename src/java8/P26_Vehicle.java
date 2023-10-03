package java8;

public interface P26_Vehicle {

	public void brand();

	public String speedUp();

	default String speedDown() {
		return "Speed down";
	}

	static String maxSpeed() {
		return "Max Speed is 250kmph";
	}

}
