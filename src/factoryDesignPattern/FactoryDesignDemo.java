package factoryDesignPattern;

public class FactoryDesignDemo {

	public static void main(String[] args) {

		ShapeFactory sf = new ShapeFactory();
		Shape circle = sf.getShape("circle");
		circle.draw();

		Shape rectangle = sf.getShape("rectangle");
		rectangle.draw();

	}

}
