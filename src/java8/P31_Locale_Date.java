package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class P31_Locale_Date {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);

		System.out.println("Yesterday==>> " + yesterday + " Today==>> " + date + " Tomorrow==>> " + tomorrow);

		DayOfWeek dayOfWeek = date.getDayOfWeek();
		boolean leapYear = date.isLeapYear();
		System.out.println(dayOfWeek + " Weeks ");
	}
}