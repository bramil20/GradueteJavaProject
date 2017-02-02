
public class AnimalList {

	private Animal anim[]= new Animal[5];
	int i = 0;
	
	
	void addAnimal(Animal anim){
		
		if (i<this.anim.length){
			this.anim[i]=anim;
			i++;
			System.out.println(anim.toString().substring(0, 4)+" has been added to your animal list at index: "+i);
		}
		else System.out.println("You cant have any more of the animalas");
	}
	
}
