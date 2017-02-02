import java.util.Scanner;

public class TestClassPractice {

	public static void main (String [] args){
		
		ClassPractice cp = new ClassPractice();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type your name. ");
		String name=input.nextLine();
		
		cp.method(name);
	}
}
