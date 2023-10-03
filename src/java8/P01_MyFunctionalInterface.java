package java8;

@FunctionalInterface
public interface P01_MyFunctionalInterface {

	void m1();

//	void m5(); //If we add two abstract method then its give error 

	default void m2() {
		System.out.println("Default method-1");
	}

	default void m3() {
		System.out.println("Default method-2");
	}

	static void m4() {
		System.out.println("Static method-1");
	}
}