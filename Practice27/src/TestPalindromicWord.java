import java.util.Scanner;

public class TestPalindromicWord {

	public static void main(String[] args) {
		
		String text, textReverse = "";
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter text to check if it's palindromic: ");
		text = input.nextLine().toLowerCase().replaceAll(" ", "");
		
		for (int i=text.length()-1; i>=0;i--){
			textReverse= textReverse + text.charAt(i);
		}
		if (text.equals(textReverse))
			System.out.println("Text is palindromic");
		else System.out.println("xxx");
	
		System.out.println(text);
		System.out.println(textReverse);
	}
	
}
