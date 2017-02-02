
public class OneMoreClass {

	private int day;
	private int month;
	private int year;
	
	public OneMoreClass(int day, int month, int year) {
	
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	}
	
	
	
	
}
