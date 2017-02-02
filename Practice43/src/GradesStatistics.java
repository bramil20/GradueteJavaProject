import java.util.Arrays;
import java.util.Scanner;

/*Enter the number of students: 4
Enter the grade for student 1: 50
Enter the grade for student 2: 51
Enter the grade for student 3: 56
Enter the grade for student 4: 53
{50,51,56,53}
The average is: 52.50
The median is: 52.00
The minimum is: 50
The maximum is: 56
The standard deviation is: 2.29*/
public class GradesStatistics {

	public static Scanner input = new Scanner(System.in);
	public static int nrStudents;
	public static int[] grades;
	public static double sum;
	public static double avg;
	public static double median;
	public static double stDeviation;
	public static double sum2;

	public static void main(String[] args) {

		addGrade();
		readArray();

		double roundAvg = Math.round(avg * 100.0) / 100.0;
		double roundStDev = Math.round(stDeviation * 100.0) / 100.0;

		System.out.println();
		System.out.println("Grade average is " + roundAvg);
		System.out.println("Grade median is " + median);
		System.out.println("Standard devitaion is " + roundStDev);
		System.out.println("The minimum is " + minimum(grades));
		System.out.println("The maximum is " + maximum(grades));

	}

	public static void addGrade() {
		System.out.print("Enter the number of students: ");
		nrStudents = input.nextInt();
		grades = new int[nrStudents];
		for (int i = 0; i < nrStudents; i++) {
			System.out.print("Enter the grade for student nr" + (i + 1) + ": ");
			int grade = input.nextInt();
			grades[i] = grade;
			sum = sum + grade;
			sum2 = sum2 + grade * grade;

		}
		Arrays.sort(grades);
		if ((nrStudents) % 2 == 0)

			median = ((double) grades[(nrStudents) / 2] + (double) grades[(nrStudents) / 2 - 1]) / 2;
		else
			median = (double) grades[(nrStudents) / 2];
		avg = sum / nrStudents;
		stDeviation = Math.sqrt(((1.0 / nrStudents) * sum2) - Math.pow(avg, 2));

	}

	public static void readArray() {
		System.out.print("{");
		for (int i = 0; i < grades.length; i++) {
			if (i != nrStudents - 1)
				System.out.print(grades[i] + ", ");
			else
				System.out.print(grades[i]);
		}
		System.out.print("}");
	}

	public static int minimum(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int maximum(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
