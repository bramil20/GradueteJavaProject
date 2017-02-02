
public class IfElse {
	public static void main(String[] args) {
		int age = 2;
		int age2 = 40;

		if (age>=0 && age < 3) {
			System.out.println("Baby");
		} 
		else if (age >= 3 && age < 7) {
			System.out.println("Toddler");
		} 
		else if (age >= 7 && age < 13) {
			System.out.println("Kid");
		}
		else if (age >= 13 && age < 20) {
			System.out.println("Teen");
		} 
		else if (age >= 20 && age < 65) {
			System.out.println("Grown up man");
		} 
		else if (age >= 65 && age <= 125) {
			System.out.println("Senior");
		}
		else  System.out.println("wrong age number");
		
		System.out.println(age2 < 50 ? "You are young" : "You are old");
	}
	
	
}
