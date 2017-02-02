import java.util.Scanner;

public class TunaF {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);
		// Tuna tunaObject = new Tuna();
		Apple book = new Apple("Kelsey");
		Apple book2 = new Apple("Nicole");

		//System.out.println("Enter the name of your first girlfriend ");
		// String temp = scan.nextLine();

		//book.setName(scan.nextLine());
		book.saying();
		book2.saying();
		int counter=18;
		
		do{
			System.out.println(counter);
			counter++;
		}
		while (counter<10);
	}

}
