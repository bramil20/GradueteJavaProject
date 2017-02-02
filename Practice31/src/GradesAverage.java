import java.util.Scanner;

/*Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0*/
public class GradesAverage {

	public static void main(String[] args) {

		int i = 0;
		int nrStudents = 0;
		int[] grades = null;
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter number of students: ");
		nrStudents = input.nextInt();
		if (nrStudents>0)
		grades = new int[nrStudents];
		else {
			System.out.println("Error. Number of students can't be below 1.");
		}
		double gradeSum = 0;
		double avg;
		
			for (i = 0; i < nrStudents; i++) {
				System.out.println("Enter the grade for student " + (i + 1));
				grades[i] = input.nextInt();
				if (grades[i]>=0 && grades[i]<=100){
				
				gradeSum += grades[i];
				}
				else {
					System.out.println("Error! All grades must be between 0 and 100. Try again");
					i--;
					continue;
					
					
				}
			}avg = gradeSum / nrStudents;
			System.out.println(gradeSum);
			System.out.println(avg);
		
		
		

	}

}
