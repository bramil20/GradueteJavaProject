
public class ArrayContains {

	public static void main(String[] args) {
		int testNumber=7678;
		int []testArray={43, 23, 123, 456, 7678, 8489, 432, 543, 1, 2, 6, 7, 756, 45, 7, 2};
		
		System.out.println(Contains(testArray, testNumber));
		
	}
	public static boolean Contains(int []array,int number){
		for (int i=0;i<array.length;i++){
			if (array[i]==number){
				return true;
			}
			
		}return false;
	}

}
