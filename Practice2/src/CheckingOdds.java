//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
//The program shall always print “BYE!” before exiting.
public class CheckingOdds {
	
	public static void main (String []args){
		
		int number=-1;
		if (number%2==1) System.out.println("ODD");
		else System.out.println("EVEN");
		System.out.println("BYE");
	}

}
