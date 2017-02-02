import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		double radius = 0;
		double area;
		double circumference;
		while(radius!=-1){
		System.out.println("Enter the radius: ");
		radius= input.nextDouble();
		
		area=radius*radius*Math.PI;
		double roundArea= Math.round(area*100.0)/100.0;
		System.out.println("The area is: "+roundArea);
	
		circumference=Math.PI*2*radius;
		double roundCircumference=Math.round(circumference*100.0)/100.0;
		System.out.println("The circumference of circle is "+roundCircumference);
		
		}
	
		//input.close();
	
	}

}
