import java.util.Scanner;

public class PercentageCalculator {


	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total amount: ");
		y = scanner.nextDouble();
		System.out.println("Enter the percentage of the total amount: ");
		x = scanner.nextDouble();
		System.out.println();
		System.out.println("Calculating percentage:(x % of y):");
		
		double result = x*y/100;
		
		System.out.println(x + "% of " + y + " is " + result);
		System.out.println();
	}

}
