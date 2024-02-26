
public class FindMax {
	
	
	public static int findMax(int[] myArray) {
		
		int x = myArray[0];
		
		for (int i=0;i<myArray.length-1;i++ ) {

			x = Math.max(myArray[i+1], x );

	}
		return x;
		
	}
	
		
	public static void main(String[] args) {
		
			
		int[] someArray = {87,17,0,16,18,102,19,21};
		
		System.out.println(findMax(someArray));  //prints 102
		
			
		}
		

	}


