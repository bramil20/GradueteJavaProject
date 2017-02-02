
public class PrintPattern2 {

	public static void main(String[] args) {
		
		int row;
		int column;
		
		for (row=1;row<=8;row++){
			for (column=1;column<=8;column++){
				if (column<=row)
					System.out.print("");
				else System.out.print("# ");			
				 }System.out.println();
		}

	}

}
