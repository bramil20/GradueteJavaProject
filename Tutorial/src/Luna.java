
public class Luna {
	
	private String name;
	private OneMoreClass birthday;

	public Luna(String name, OneMoreClass birthday) {
	
		this.name= name;
		this.birthday= birthday;
	}

	public String toString(){
		return String.format("Your name: %s \nYour birthday: %s", name, birthday);
	}
	
	
	
}
