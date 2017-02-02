// Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average. The output shall look like:

//The sum is 5050
//The average is 50.5
public class SumAndAverage {

	public static void main(String[] args) {
		int i;
		int sum=0;
		double avg=0;
		for (i=1;i<=100;i++){
			
		sum=sum+i;
		double x=i;
		avg=sum/x;
		}
		
		//double x=i-1;
		//avg=sum/x;
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+avg);
	
	
	
		//Modify the program to use a "while-do" loop instead of "for" loop. 
		int sum1=0;
		int i1=1;
		double avg1 = 0;
		while (i1<=100){
			sum1+=i1;
			double x1=i1;
			avg1=sum1/x1;
			i1++;			
		}
		System.out.println("The sum1 is "+sum1);
		System.out.println("The average1 is "+avg1);
	}

}
