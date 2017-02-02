
public class HarmonicSum {

	public static void main(String[] args) {

		double sum=0;
		
		double n;
		
		for(n=1;n<=50000;n++){
			
			sum+=(1/n);
			
		}
		System.out.println("Sum of harmonic array with 50000 elements is "+sum);
		
	}

}
