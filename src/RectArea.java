import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectArea {


	public static void main(String[] args) {
		
		int width = 0;
		int length=0;
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the length of a rectangle: ");
			length = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the width of a rectangle: ");
			width=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException ne){
			System.out.println("IO Error: " + ne);
			System.exit(0);
		}
		catch(IOException ioe){
			System.out.println("IO Error: " + ioe);
			System.exit(0);
		}
		
		int area = length * width;
		
		System.out.println("Area of a rectangle is " + area);
	}

}
