
public class TestMyAnimal {

	public static void main (String [] args){
		
		AnimalList anil= new AnimalList();
		
		Animal dogg= new Dog();
		Animal fush= new Fish();
		
		anil.addAnimal(dogg);
		anil.addAnimal(fush);
		anil.addAnimal(fush);
		anil.addAnimal(dogg);
		anil.addAnimal(dogg);
		anil.addAnimal(dogg);
		anil.addAnimal(dogg);
	}
}
