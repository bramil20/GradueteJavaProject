
public class Saw {
	
	public static void main (String [] args){
		Animal animeList[]= new Animal[3];
		
		Animal a = new Animal();
		Dog d= new Dog();
		Fish f = new Fish();
		
		animeList[0]= a;
		animeList[1]= d;
		animeList[2]= f;
		
		
		for (Animal an: animeList)
			an.makeSomeNoise();
	}

}
