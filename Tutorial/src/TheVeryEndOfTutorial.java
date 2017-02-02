import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TheVeryEndOfTutorial {

	public static void main(String [] args){
		int x=1;
	do{
		try {
			Scanner scan= new Scanner(System.in);
			System.out.println("Write your first number:\t");
			int n1=scan.nextInt();
			System.out.println("Write your second number and we will divide those two:\t ");
			int n2=scan.nextInt();
			int sum=n1/n2;
			x=2;
			System.out.println(n1+"/"+n2+" are equal to:"+sum);
			
		} catch (Exception e) {
			
			
			System.out.println("You cant use those numbers");
		}
	}while  (x==1);
	
	}
	
}
