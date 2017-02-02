import java.lang.reflect.Array;

public class Swap {

	public static void main(String[] args) {
		int [] testArray1={1,2,3,4,1330};
		int [] testArray2={6,8,9,34,5};
		
		System.out.print("First array before: "+testArray1[0]+" ");
		System.out.print(testArray1[1]+" " );
		System.out.print(testArray1[2]+" ");
		System.out.print(testArray1[3]+" ");
		System.out.print(testArray1[4]+" ");
		System.out.println();
		System.out.print("Second array before: "+testArray2[0]+" ");
		System.out.print(testArray2[1]+" " );
		System.out.print(testArray2[2]+" ");
		System.out.print(testArray2[3]+" ");
 
		System.out.println(swap(testArray1, testArray2));
		
		System.out.print("First array now: "+testArray1[0]+" ");
		System.out.print(testArray1[1]+" " );
		System.out.print(testArray1[2]+" ");
		System.out.print(testArray1[3]+" ");
		System.out.print(testArray1[4]+" ");
		System.out.println();
		System.out.print("Second array now: "+testArray2[0]+" ");
		System.out.print(testArray2[1]+" " );
		System.out.print(testArray2[2]+" ");
		System.out.print(testArray2[3]+" ");
		System.out.print(testArray2[4]+" ");
	}
	public static boolean swap(int[]array1, int[]array2){
		for (int i=0;i<array1.length;i++){
		array1[i]=array1[i]+array2[i];
		array2[i]=array1[i]-array2[i];
		array1[i]=array1[i]-array2[i];
			
		}System.out.println();
		return true;
		
	}

}
