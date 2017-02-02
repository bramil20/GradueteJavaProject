//Exercise Product1ToN (Loop): Write a program called Product1ToN to compute the product of integers 1 to 10 (i.e., 1󫎿�...�10). 
//Try computing the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. 
//Write down the product obtained and explain the results.
public class Production {

	public static void main(String[] args) {
		long product = 1;
		int i;
	
		for (i = 1; i <= 10; i++) {

			product *= i;
			
		}
		System.out.println("Production of "+(i-1)+" is: " + product);
		product=1;
		for ( i = 1; i <= 11; i++) {

			product *= i;
			
		}
		System.out.println("Production of "+(i-1)+" is: " + product);
		product=1;
		for (i = 1; i <= 12; i++) {

			product *= i;
		}
		System.out.println("Production of "+(i-1)+" is: " + product);
		product=1;
		for (i = 1; i <= 13; i++) {

			product *= i;
		}
		System.out.println("Production of "+(i-1)+" is: " + product);
		product=1;
		for (i = 1; i <= 14; i++) {

			product *= i;
		}
		System.out.println("Production of "+(i-1)+" is: " + product);   //not correct, you need to use long instead of int
		product=1;
		
	}
	
}
