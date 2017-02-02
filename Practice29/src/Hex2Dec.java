import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {

		/*
		 * Enter a Hexadecimal string: 1a The equivalent decimal number for
		 * hexadecimal "1a" is: 26
		 * 
		 * Enter a Hexadecimal string: 1y3 error: invalid hexadecimal string
		 * "1y3"
		 */

		String hexadecimal;
		int decimal = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter you hexadecimal value to convert to decimal: ");
		hexadecimal = input.nextLine().toLowerCase();

		try {
			if (hexadecimal.contains("a") || hexadecimal.contains("b") || hexadecimal.contains("c")
					|| hexadecimal.contains("d") || hexadecimal.contains("e") || hexadecimal.contains("f")
					|| hexadecimal.contains("0") || hexadecimal.contains("1") || hexadecimal.contains("2")
					|| hexadecimal.contains("3") || hexadecimal.contains("4") || hexadecimal.contains("5")
					|| hexadecimal.contains("6") || hexadecimal.contains("7") || hexadecimal.contains("8")
					|| hexadecimal.contains("9")) {

				decimal = Integer.parseInt(hexadecimal, 16);

				System.out.println(decimal);
			} else
				System.out.println("Wrong hexadecimal format");

		} catch (NumberFormatException e) {
			System.out.println("Wrong format");

		}

	}

}
