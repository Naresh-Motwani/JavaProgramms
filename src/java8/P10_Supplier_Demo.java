package java8;

import java.util.function.Supplier;

public class P10_Supplier_Demo implements Supplier<String> {

	@Override
	public String get() {
		return "Hi Supplier is working ";
	}

	public static void main(String[] args) {
		Supplier<String> supplier = new P10_Supplier_Demo();
		System.out.println(supplier.get());
	}

}
