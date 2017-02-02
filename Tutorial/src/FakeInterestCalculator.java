
public class FakeInterestCalculator {

	public static void main(String[] args) {

		double total;
		double principle = 10000;
		double rate = 0.07;

		for (int year = 0; year <= 5; year++) {
			total = principle * Math.pow(1 + rate, year);
			System.out.println(+year + " total amount: " + total + "euros");
		}

	}

}
