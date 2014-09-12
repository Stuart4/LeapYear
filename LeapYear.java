import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);

		while (true){
			if(!isLeapYear(sin.nextLong()))
				System.out.println("Not a leap year");
		}
	}

	public static boolean isLeapYear (long year) {
	
		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {

					return true;

				}
				
				return false;

			}
			return true;

		}
		return false;

	}

}
