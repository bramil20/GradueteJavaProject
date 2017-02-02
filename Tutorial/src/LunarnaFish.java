
public class LunarnaFish {

	private String name;
	private String river;
	private static int species=0;
	
	public LunarnaFish(String name, String river) {
		this.name= name;
		this.river=river;
		species++;
		
		System.out.printf("%s River: %s, varaity of fishes: %d \n", name, river, species);
		
	}

	public String getName() {
		return name;
	}

	public String getRiver() {
		return river;
	}

	public static int getSpecies() {
		return species;
	}
	
	
}
