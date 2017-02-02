
public class ArraysAndMethodsAndS {

	public static void main(String[] args) {
		
		int array1[]= new int [0];
		int array2[]= new int [1];
		int array3[]= new int [1000];
		int i = 0;
		array2[0]=5;
		
		for (int n=0;n<array3.length;n++){
			array3[n]=i;
			i++;
			
		}
		printArray(array1);
		System.out.println();
		printArray(array2);
		System.out.println();
		printArray(array3);
		
	}
	public static void printArray(int [] array){
		System.out.print("{");
		for (int i =0; i<array.length;i++){
			if(i!=array.length-1){
			System.out.print(array[i]+", ");
			}else System.out.print(array[i]);
		}System.out.print("}");
	}
	public static void printArray(double [] array){
		System.out.print("{");
		for (int i =0; i<array.length;i++){
			if(i!=array.length-1){
			System.out.print(array[i]+", ");
			}else System.out.print(array[i]);
		}System.out.print("}");
	}
}
