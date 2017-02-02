import java.util.Scanner;

/*Enter a Binary string: 1011
The equivalent decimal number for binary "1011" is: 11
 
Enter a Binary string: 1234
error: invalid binary string "1234"*/

public class Bin2Dec {

	public static void main(String[] args) {
		
		String binary;
		int decimal;
		Scanner input= new Scanner(System.in);
		binary= input.nextLine();
		
		
		
		try {
			if (!(binary.contains("0") || binary.contains("1"))){
				System.out.println("That is not binary");
			}
				
			else {
				decimal= Integer.parseInt(binary,2);
				System.out.println("Your binary "+ binary+" is equal to "+decimal+" decimal");
			}
		} catch (NumberFormatException e) {
			
			System.out.println("That is not binary");
		}
		
		
		//System.out.println(decimal);	
		}

}
