
public class Apple {

	private String girlName;

	public Apple(String name) {
		girlName = name;
	}

	public void setName(String name) {
		girlName = name;
	}

	public String getName() {
		return girlName;
	}

	public void saying() {
		System.out.printf("Your first girlfriend was %s\n", getName());
	}
}
