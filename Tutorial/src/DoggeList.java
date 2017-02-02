
public class DoggeList {

	private Dog dogg[] = new Dog[5];
	private int i =0;
	
	public void addDogge(Dog dog){
		
		if (i<dogg.length){
			dogg[i]= dog;
			i++;
			System.out.println(dog+" has been added to dogge list at index: "+i);
		}
		
	}
}
