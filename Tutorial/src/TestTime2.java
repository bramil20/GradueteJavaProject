
public class TestTime2 {

	public static void main (String []args){
		TimePractice2 time= new TimePractice2();
		TimePractice2 time2= new TimePractice2(5);
		TimePractice2 time3= new TimePractice2(5, 13);
		TimePractice2 time4= new TimePractice2(5, 13, 37);
		
		OneMoreClass omc= new OneMoreClass(22, 2, 1995);
		
		System.out.printf("%s\n", time.toMilitary());
		System.out.printf("%s\n", time2.toMilitary());
		System.out.printf("%s\n", time3.toMilitary());
		System.out.printf("%s\n", time4.toMilitary());
		System.out.println("ez");
		System.out.println(omc.toString());
	}
}
