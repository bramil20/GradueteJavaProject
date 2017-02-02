
public class Switching {
	public static void main (String args[]){
		int babyAge = 45;
		
		switch (babyAge){
		case 0: System.out.println("You can't do anything");
		break;
		case 1: System.out.println("You can crawl");
		break;
		case 2: System.out.println("You can walk!");
		break;
		default:
			System.out.println("You are not a baby, oldie.");
		}
	}
}
