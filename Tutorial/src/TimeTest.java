
public class TimeTest {

	public static void main (String[] args){
		TimePractice time = new TimePractice();
		
		System.out.println(time.militaryTime());
		System.out.println(time.americanTime());
		
		time.setTime(20, 20, 57);
		System.out.println(time.militaryTime());
		System.out.println(time.americanTime());
		
		
	}
}
