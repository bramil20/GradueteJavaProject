
public class Tribonacci {

	public static void main(String[] args) {

		int n;
		int tN;
		int firstNum = 1;
		int secondNum = 1;
		int thirdNum = 2;
		System.out.print(firstNum + " " + secondNum + " " + thirdNum);
		for (n = 4; n <= 20; n++) {
			tN = firstNum + secondNum + thirdNum;

			thirdNum = secondNum;
			secondNum = firstNum;
			firstNum = tN;

			System.out.print(" " + tN);
		}

	}

}
