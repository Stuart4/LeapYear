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

//import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
	}

	public static boolean isLeapYear (long year) {
		if (year % 4 != 0 || year % 100 == 0)
			return false;
		return true;
	}
}
