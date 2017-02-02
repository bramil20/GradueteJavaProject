
public class ArrayEnchPractice {

	public static void main(String [] args){
		int array[]={1,2,3,4,5,6,7};
		change(array);
		
		for (int y: array)
			
			System.out.println(y=y+2);
		
	}
	public static void change(int x[]){
		for (int counter=0;counter<x.length; counter++){
		x[counter]*=x[counter++]/2;
		
		}
	}
}
