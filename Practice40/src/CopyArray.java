import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int testArray[]= {1, 2, 3, 4, 1300};

		System.out.println(copyOf(testArray));
	}
	
	public static boolean copyOf(int[] array){
	
		
		Arrays.copyOf(array, array.length-1);
		return true;
		
		
		
	}
	
}
