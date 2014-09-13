/*
 * LeapYear
 * 
 * computs if a year is a leap year or not
 *
 * @author Jacob Stuart
 * 
 * @lab 806
 *
 * 12 September, 2014
 */

import java.util.*;
import java.io.*;
public class LeapYear {

	public static void main (String[] args) throws FileNotFoundException  {
		Scanner sin = new Scanner(new File("./leaps.txt"));

		while(sin.hasNextLong()) {
			long year = sin.nextLong();

			if (!isLeapYear(year)) {
				System.out.printf("fail at %d\n", year);
				System.exit(1);
			}
		}

	}

	public static boolean isLeapYear (long year) {
		if (year % 400 == 0) return true;
		if (year % 4 != 0 || year % 100 == 0)
			return false;
		return true;
	}
}
