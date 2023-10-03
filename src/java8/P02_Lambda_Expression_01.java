package java8;

@FunctionalInterface
interface Lambda_Expression {
	void m1();
}

public class P02_Lambda_Expression_01 {

	public static void main(String[] args) {

		Lambda_Expression leExpression = () -> {
			System.out.println("Abstract Method of functional interface ");
		}; // if we want to print 1 statement then we can remove {}
		leExpression.m1();

	}

}
