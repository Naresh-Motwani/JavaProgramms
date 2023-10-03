package programs;

public class P44_Parameter_Constractor {

	private final String nameString;
	private final int year;

	public P44_Parameter_Constractor(String nameString, int year) {
		super();
		this.nameString = nameString;
		this.year = year;
	}

	public static void main(String[] args) {
		P44_Parameter_Constractor paraConstractor = new P44_Parameter_Constractor("Radhe Krishna ", 1947);
		System.out.println(paraConstractor.nameString + " " + paraConstractor.year);

	}

}
