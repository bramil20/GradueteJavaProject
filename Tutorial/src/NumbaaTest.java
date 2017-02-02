
public class NumbaaTest {
	
	public static void main (String []args){
		AddingTen aTen = new AddingTen(10);
		
		for (int i=0;i<5; i++){
			System.out.printf("%s", aTen.toString());
			aTen.tenIncrease();
		}
	}

}
