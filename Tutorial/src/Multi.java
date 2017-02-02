
public class Multi {

	public static void main(String[] args) {
		int array1[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int array2[][] = { { 2, 4 }, { 42, 1300, 5, 8 } };
		System.out.println("This is the first matrix");
		matrix(array1);

		System.out.println("This is the second matrix");
		matrix(array2);
	}

	public static void matrix(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}

	}

}
