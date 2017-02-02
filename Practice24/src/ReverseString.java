import java.util.Scanner;

//Enter a String: abcdef
//The reverse of the String "abcdef" is "fedcba".

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		String text;
		System.out.print("Type text here: ");
		text= input.nextLine();
		

		for (int i=text.length()-1;i>=0;i--){
			
			
			System.out.print(text.charAt(i));
		}
	}

}
