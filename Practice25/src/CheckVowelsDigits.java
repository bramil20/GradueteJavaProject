import java.util.Scanner;

//Enter a String: testing12345
//Number of vowels: 2 (16.67%)
//Number of digits: 5 (41.67%)
public class CheckVowelsDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		String text;
		double totalVowels = 0;
		double totalDigits=0;

		
		
		System.out.println("Enter your text to count for digits or vowels: ");
		text = input.next().toLowerCase();
		System.out.println(text);

		char c;
		 for (int i=0;i<text.length();i++){
			 text.charAt(i);
		 
		 
			switch (text.charAt(i)) {
			case 'a':
				totalVowels++;
				break;

			case 'e':
				totalVowels++;
				break;

			case 'i':
				totalVowels++;
				break;

			case 'o':
				totalVowels++;
				break;

			case 'u':
				totalVowels++;
				break;

			case '1' :
				totalDigits++;
				break;
				
			case '2' :
				totalDigits++;
				break;
				
			case '3' :
				totalDigits++;
				break;
				
			case '4':
				totalDigits++;
				break;
				
			case '5':
				totalDigits++;
				break;
				
			case '6':
				totalDigits++;
				break;
				
			case '7':
				totalDigits++;
				break;
				
			case '8':
				totalDigits++;
				break;
			
			case '9':
				totalDigits++;
				break;
				
			case '0':
				totalDigits++;
				break;
				
			}	
				

			}
			System.out.println(totalVowels);
			System.out.println(totalDigits);
			System.out.println(text.length());
			
			double percentVowels =totalVowels/text.length()*100;
			double percentDigits= totalDigits/text.length()*100;
			
			double roundVowel= Math.round(percentVowels*100.0)/100.0;
			double roundDigit=Math.round(percentDigits*100.0)/100.0;
		
		System.out.printf("Total number of vowels in percent is: %s%%. ", roundVowel);
		System.out.printf(" Total number of digits in percent is: %s%%", roundDigit);
	}

}
