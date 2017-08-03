import java.util.Scanner;

public class LeapYear {

	
	public static void main(String[] args) {
		System.out.println("Leap Year Checker");
		System.out.println("-----------------");
		System.out.println("Enter a year to check: ");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("The year " + year + " is a leap year");
		else
			System.out.println("The year " + year + " is not a leap year");
	}

}
