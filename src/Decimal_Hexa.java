import java.util.Scanner;

public class Decimal_Hexa {
	Scanner scan;
	int num;
	
	void getVal(){
		System.out.println("Decimal to Hexadecimal");
		scan = new Scanner(System.in);
		
		System.out.println("\nEnter the number: ");
		num = Integer.parseInt(scan.nextLine());
	}
	
	void convert(){
		String hexa = Integer.toHexString(num);
		
		System.out.println("Hexadecimal value is: " + hexa);
	}
}
