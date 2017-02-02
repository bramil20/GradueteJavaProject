
public class SummingEverySeventhNr {

	public static void main(String[] args) {

		int sum = 0;
		double avg = 0;
		int i;
		for (i = 0; i <= 100; i = i + 7) {
			sum += i;
			double x = i;
			avg = sum / x;

		}
		System.out.println(i);
		System.out.println(sum);
		System.out.println(avg);

		int i1;
		int sum1 = 0;
		for (i1 = 1; i1 <= 10; i1++) {
			sum1 = sum1+(i1 * i1);

		}
		System.out.println((i1-1)+"! * "+(i1-1)+"! ="+sum1); // I wanted to make 1*1+2*2+3*3...10*10 whcih I did.

	}

}
