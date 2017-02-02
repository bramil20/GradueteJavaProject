
public class TimeTable {

	public static void main(String[] args) {
		System.out.print("* |");
		for (int z = 1; z <= 9; z++) {

			System.out.print("  " + z);

		}

		System.out.println("\n------------------------------");
		for (int x = 1; x <= 9; x++) {
			System.out.print(x + " |");
			for (int y = 1; y <= 9; y++) {
				if (x * y < 10)
					System.out.print("  " + x * y);
				else
					System.out.print(" " + x * y);
			}
			System.out.println();

		}
	}

}
