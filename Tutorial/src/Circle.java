import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert r value(in cm): \t");

		double r = input.nextDouble();

		final double PI = 3.14;
		double p = r * r * PI;

		System.out.println("Povrsina is: " + p + "cm");
	}

}
