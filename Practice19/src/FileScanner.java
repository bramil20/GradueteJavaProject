/*Enter an integer: 12
Enter a floating point number: 33.44
Enter your name: Peter
Hi! Peter, the sum of 12 and 33.44 is 45.44*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan= new Scanner(new File("in.txt"));
		
		int x;
		float y;
		String name;
		float sum;
		
		System.out.print("Enter a integer: ");
		x= scan.nextInt();
		
		System.out.print("Enter a floating point number: ");
		y= scan.nextFloat();
		
		System.out.print("Enter your name: ");
		name = scan.next();
		
		sum= x+y;
		System.out.println("Hi! "+name+", the sum of "+x+" and "+y+" is "+sum);
		
		
		scan.close();
	}
// THIS PROJECT WONT WORK FOR SOME REASON
}
