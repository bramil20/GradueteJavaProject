import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {

		int testArray1[]={1, 2, 3};
		int testArray2[]={1, 2, 3};
		
		System.out.println(equals(testArray1, testArray2));
	}

	public static boolean equals(int[] array1, int[] array2) {
		if (Arrays.equals(array1, array2)) return true;
		return false;
		
		
	}

}
