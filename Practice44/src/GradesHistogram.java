import java.util.Scanner;

import javax.script.Bindings;

/*  0 -  9: ***
 10 - 19: ***
 20 - 29: 
 30 - 39: 
 40 - 49: *
 50 - 59: *****
 60 - 69: 
 70 - 79: 
 80 - 89: *
 90 -100: **

                                *                           
                                *                           
  *     *                       *                           
  *     *                       *                       *   
  *     *                 *     *                 *     *   
 0-9  10-19 20-29 30-39 40-49 50-59 60-69 70-79 80-89 90-100*/
public class GradesHistogram {

	public static Scanner input = new Scanner(System.in);
	public static int bins[] = new int[10];
	public static int[] grade = { 1, 1, 2, 3, 9, 82, 80, 76, 59, 57, 52, 99, 99, 99 };

	public static void main(String[] args) {

		gradesHistogram();
	}

	public static void gradesHistogram() {
		// int[] grade = { 21, 1, 17, 9, 79, 82, 80, 76, 59, 57, 52 };

		for (int level = 0; level < bins.length - 1; level++) {

			for (level = 0; level < bins.length; level++) {
				if (level == 0)
					System.out.print("  " + 10 * level + "-" + ((10 * level) + 9) + ":");

				else
					System.out.print(10 * level + "-" + ((10 * level) + 9) + ":");

				for (int i = 0; i < grade.length; i++) {
					if (grade[i] >= level * 10 && grade[i] <= level * 10 + 9) {
						System.out.print("*");
					}

					else
						System.out.print("");
				}
				System.out.println();

			}

		}
		for (int binNum = 0; binNum < bins.length; binNum++) {

			for (int starNum = 0; starNum < bins.length; starNum++) {
					if (grade[starNum] >= binNum * 10 && grade[starNum] <= binNum * 10 + 9) {
						System.out.print("*");
						
					}

				
				}System.out.println();
				
				System.out.print(10 * binNum + "-" + ((10 * binNum) + 9) + " ");

			}
		

	}
}
