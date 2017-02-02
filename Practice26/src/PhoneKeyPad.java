import java.util.Scanner;

//On your phone keypad, the alphabets are mapped to digits as follows: ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9). 
//Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), and converts to a sequence of keypad digits.
//Use a nested-if (or switch-case) in this exercise.
public class PhoneKeyPad {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		String text;
		
		System.out.println("Enter your text here: ");
		text= input.nextLine().toLowerCase();
		
		for  (int i=0;i<text.length();i++){
		switch (text.charAt(i)) {
		case 'a':
		case 'b':
		case 'c':
			System.out.print('2');
			break;
		case 'd':
		case 'e':
		case 'f':
			System.out.print('3');
			break;
		case 'g':
		case 'h':
		case 'i':
			System.out.print('4');
			break;
		case 'j':
		case 'k':
		case 'l':
			System.out.print('5');
			break;
		case 'm':
		case 'n':
		case 'o':
			System.out.print('6');
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			System.out.print('7');
			break;
		case 't':
		case 'u':
		case 'v':
			System.out.print('8');
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			System.out.print('9');
			break;
			default : System.out.println("Invalid input");
			break;
		}
		
		}
	}

}
