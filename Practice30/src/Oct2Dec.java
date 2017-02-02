import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
		
		String octal;
		int decimal = 0;
		char octalCh;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Write you ocatal number to turn the to decimal: ");
		octal= input.nextLine();
		
		try {
			for (int i=0;i<octal.length();i++){
				octalCh=octal.charAt(i);
				if (!(octalCh=='8' || octalCh=='9')){
					decimal= Integer.parseInt(octal, 8);
				}else System.out.println("Wrong octal format");
			}System.out.println(decimal);
		} catch (NumberFormatException e) {
			System.out.println("Wrong format");
		}

	}

}
