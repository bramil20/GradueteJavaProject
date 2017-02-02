import java.util.Random;

public class RandomNumberGenerator {
	
	public static void main (String [] args){
		Random dice = new Random();
		double totalScore=0;
		double avg=0;
		
		for( int counter=1; counter<=10;counter++){
			
			int number = 1+ dice.nextInt(6);
			
			if (number==6){
				System.out.println(counter+"th throw: "+number);
				System.out.print(number+ "! ");
				System.out.println(" You got bonus throw ");
				counter--;
			}else {
			
			System.out.println(counter+"th throw: "+number);
			}
			
			totalScore=totalScore +number;
			avg= totalScore/counter;
			
	}
		System.out.println("---------------------------------------------------------------");
		System.out.println("Your total score is: "+totalScore+ "     Your average throw is: "+avg);
		
	
	}
	

}
