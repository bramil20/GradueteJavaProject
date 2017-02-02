import java.util.Scanner;

public class Hex2Bin {

	public static void main(String[] args) {
		
		String hexadecimal;
		int decimal;
		String binary;
		Scanner scan= new Scanner(System.in);

		System.out.println("Enter hexadecimal string: ");
		hexadecimal = scan.nextLine();
		
		decimal= Integer.parseInt(hexadecimal, 16);
		binary= Integer.toBinaryString(decimal);
		
		System.out.println("Your hexadecimal value changed to binary is now: "+binary);
		
	}

}
