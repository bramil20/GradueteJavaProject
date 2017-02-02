
public class ExtractDigits {

	public static void main(String[] args) {


		int number=15423;
		int digit;
		while (number>0){
			digit=number%10;
			number/=10;
			System.out.print(digit+" ");
		}
		System.out.println();
		System.out.println();
		for (number=15423;number>0;number/=10){
			digit=number%10;
			System.out.print(digit+" ");
		}
	}

}
