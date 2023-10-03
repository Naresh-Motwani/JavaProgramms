package java8;

import java.util.List;

public class P01_Product {

	private int pro_id;
	private String pro_name;
	private double pro_price;
	private String address;
	private List<String> itemList;

	public P01_Product(int pro_id, String pro_name, double pro_price, String address, List<String> itemList) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.pro_price = pro_price;
		this.address = address;
		this.itemList = itemList;
	}

	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public double getPro_price() {
		return pro_price;
	}

	public void setPro_price(double pro_price) {
		this.pro_price = pro_price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getItemList() {
		return itemList;
	}

	public void setItemList(List<String> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "P01_Product [pro_id=" + pro_id + ", pro_name=" + pro_name + ", pro_price=" + pro_price + ", address="
				+ address + ", itemList=" + itemList + "]";
	}
}