
public class PrintPattern3 {

	public static void main(String[] args) {

		for (int x=7;x>0;x--){
			
			for( int y=7;y>0;y--){
				System.out.print(" ");
				if(x>=y)
				System.out.print("#");
				
				else System.out.print(" ");
			}System.out.println("");
		}
		

	}

}
