//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
public class CozaLozaWoza {

	public static void main(String[] args) {
		
		int i;
		
		
		for (i=1;i<=110;i++){
			if(i%3==0 && i%5==0 && i%7==0) System.out.print("CozaLozaWoza");
			else if	(i%5==0 && i%7==0) System.out.print("LozaWoza");
			else if (i%3==0 && i%7==0) System.out.print("CozaWoza");
			else if (i%3==0 && i%5==0) System.out.print("CozaLoza");
			else if (i%3==0) System.out.print("Coza ");
			else if (i%5==0) System.out.print("Loza ");
			else if (i%7==0) System.out.print("Woza ");
			 
			else System.out.print(" "+i+" ");
			
			if(i%11==0) System.out.println();
			
		}

	}

}
