
public class SearchArray {

	public static void main(String[] args) {

		int[] testArray = { 2, 5, 76, 65, 23, 9, 235, 53, 65, 746 };
		int indexOfArray = 746;

		System.out.println(search(testArray, indexOfArray));

	}

	public static int search(int[] array, int index) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == index) {
				return i;
			}

		}
		return -1;
	}

}
