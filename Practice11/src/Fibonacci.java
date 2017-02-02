//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5       F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1

public class Fibonacci {

	public static void main (String [] args){
		
	int n;
	int fn = 0;
	int fnFirst = 1;
	int fnSecond=1;
	
	double sum = 0;
	
	System.out.print("This are first 20 numbers of fibonaci: \n"+fnFirst+" "+fnSecond);
	for (n=3;n<=20;++n){
		
		fn=fnFirst+fnSecond;
		sum=sum+fnFirst+fnSecond; 
		fnSecond=fnFirst;
		fnFirst=fn;
	
		System.out.print(" "+fn);
		
		
		
		
		
	}
	
	double avg=((sum+2))/(n-1);
	System.out.println("\n"+sum);
	System.out.println("\n"+avg);
	
	
	
	}
}
