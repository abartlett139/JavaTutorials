import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFactorial {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter an integer to calculate it's factorial ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		
		int result= fact(a);
		
		System.out.println("factorial of " + a + " is = " + result);
	}
	
	static int fact(int b){
		if(b<=1)
			return 1;
		else
			return b*fact(b-1);
	}

}
