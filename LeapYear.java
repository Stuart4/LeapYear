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
		//System.out.println(isLeapYear(200));
	}

	public static boolean isLeapYear (long year) {
		if (year % 400 == 0) {
			return true;
		}
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return false;
			}
			return true;
		}	
		return false;
	}
}
