
public class ForSqrt {

	public static void main(String[] args) {

		for (int counter = 15; counter >= 0; counter--) {
			
			int amount = (int) Math.pow(2, counter);
			System.out.println( "2^"+counter+ " = "+amount);
			

		}
	}
}
