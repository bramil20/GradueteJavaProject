
public class DReverse {

	public static void main(String[] args) {

		int []arrayTest= new int []{0, 1, 2, 3, 4, 1300};
		reverse(arrayTest);
		
		
	}
	
	public static void reverse(int[] array){
		System.out.print("{");
		for(int i=array.length-1;i>=0;i--){
			if (i!=0)
			System.out.print(array[i]+", ");
			else System.out.print(array[i]);
		}System.out.print("}");
	}

}
