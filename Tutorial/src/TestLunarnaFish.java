
public class TestLunarnaFish {

	public static void main(String[] args) {

		LunarnaFish lunar = new LunarnaFish("Catfish", "Sava");
		LunarnaFish lunar2 = new LunarnaFish("Swordfish", "Dunav");
		LunarnaFish lunar3 = new LunarnaFish("Regural fish", "Many");
		LunarnaFish lunar4 = new LunarnaFish("Jellyfish", "Ada");

		System.out.println(lunar + " " + LunarnaFish.getSpecies());
	}

}
