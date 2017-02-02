
public class PrintPattern {

	public static void main(String[] args) {
		int row;
		int column;
		
		int maxColumn=7;
		
		for (row=0;row<=7;row++){
			for (column=0; column<=maxColumn;column++){
				if (row>=column)
					System.out.print("# ");
				
				else System.out.print(" ");
					}System.out.println();
		}

	}

}
