import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Eight {

	
	static int sum=0;

	public static boolean hasEight(int number){
		//Scanner input= new Scanner(System.in);
		//do{
			
		//System.out.println("Please enter integer or -1 to exit");
		//number= input.nextInt();
		String numberS = ""+ number;
		for (int i=0;i<numberS.length();i++){
			numberS.charAt(i);
		if (numberS.contains("8")) return true;
		} return false;
		//}
		//while (number==-1);
		
	}


	
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		int numba = 0;
		while(numba!=-1){
		System.out.println("Please Enter Integer or -1 to Exit");
		numba = input.nextInt();
		if (hasEight(numba)==true)
		sum=sum+numba;
		
		}
		System.out.println("Magic sum is "+sum);
		
		
	}



}
