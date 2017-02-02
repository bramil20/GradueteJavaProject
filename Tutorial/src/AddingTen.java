
public class AddingTen {
	
	private int sum;
	private final int NUMBAA;
	
	public AddingTen(int number) {
		NUMBAA=number;
	}
	
	public void tenIncrease(){
		sum+=NUMBAA;
	}
	
	
	
	public String toString(){
		return String.format("sum %d\n", sum);
	}
}
