import java.util.Scanner;

public class Tutorial2 {
		
	public static void main (String args[]){
		double fnum, snum, answer;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Here we will calculate sum of the two nubmers");
		
		System.out.println("Press Enter to continue");
		userInput.nextLine();
		
		System.out.println("Write your first number and press Enter: ");
		fnum = userInput.nextDouble();
		System.out.println("Please Type your next nubmer and press Enter: ");
		snum = userInput.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
