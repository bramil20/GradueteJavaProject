
public class ArrayToString {

	public static void main(String[] args) {
		
		int array0[]= new int[0];
		int array2[]= new int [1];
		int array1[]= {0,2,5,6,7,7};
		
		array2.toString();
		array2[0]=1300;
	
		arrayToString(array1);
		System.out.println();
		arrayToString(array0);
		System.out.println();
		arrayToString(array2);
		
	}
	public static void arrayToString(int []array){
		System.out.print("{");
		for (int i=0;i<array.length;i++){
			if (i!=array.length-1){
			System.out.print(array[i]+", ");
			}
			else System.out.print(array[i]);
		}System.out.print("}");
		array.toString();
		
	}

}
