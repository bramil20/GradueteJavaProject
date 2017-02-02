
public class GraphicDebugger {

	public static void main (String []args){
		
		int factoriel=1;
		int i;
		for (i=1;i<=20;++i){
			factoriel*=i;
			System.out.println(factoriel+" of "+i+"!");
		}
		System.out.println("Factoriel of "+(i-1)+" is "+factoriel);
	}
}
