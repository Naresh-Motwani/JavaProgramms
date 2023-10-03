package java8;

import java.util.List;
import java.util.stream.Collectors;

public class P01_Product_Main {

	public static void main(String[] args) {

		List<P01_Product> products = P01_Product_DAO.getAll();

		List<P01_Product> item = products.stream().filter(product -> product.getPro_name().contains("Shampoo"))
				.collect(Collectors.toList());

		for (P01_Product i : item) {
			System.out.println("List of product is =>  " + i);
		}

		
		
		
		
	}

}
