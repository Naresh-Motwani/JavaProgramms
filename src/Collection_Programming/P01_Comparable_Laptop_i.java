package Collection_Programming;

public class P01_Comparable_Laptop_i implements Comparable<P01_Comparable_Laptop_i> {

	private String brand;
	private int price;
	private int ram;
	private String colour;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "P01_Comparable_Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + ", colour=" + colour
				+ "]";
	}

	public P01_Comparable_Laptop_i(String brand, int price, int ram, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.colour = colour;
	}

	@Override
	public int compareTo(P01_Comparable_Laptop_i o) {

		if (this.getPrice() > o.getPrice()) {
			return 1;
		} else if (this.getPrice() < o.getPrice()) {
			return -1;
		} else {
			return 0;
		}

	}

}
