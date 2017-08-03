
public class ContinueExample {


	public static void main(String[] args) {
		int intArray[] = new int[]{1,2,3,4,5};
		
		System.out.println("all numbers except for 3 are :");
		
		for(int i=0;i<intArray.length;i++){
			if(intArray[i]==3)
				continue;
			else
				System.out.println(intArray[i]);
		}
	}

}
