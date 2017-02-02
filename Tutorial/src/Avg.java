import java.util.Scanner;

public class Avg {

	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		double gradeSum=0;
		int counter=0;
		int grade;
		double avg;
		System.out.println("Type 10 grades here");
		while (counter<10){
			grade = input.nextInt();
			gradeSum = gradeSum + grade;
			counter++;
		}
		System.out.println(gradeSum);
		System.out.println(counter);
		avg = gradeSum/(counter);
		System.out.println("Students average grade is :"+ avg);
	
	
	
	}
}
