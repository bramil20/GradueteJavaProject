

//PI= 4*(1-1/3+1/5.....)


public class ComputePI {

	public static void main(String[] args) {
		double i;
		double PI=0;
		
		for(i=1;i<1000000;i=i+2){
			if (i%4==1){
				PI+=1/i;
			}
			else if (i%4==3){
				PI-=1/i;
			}
			//System.out.println(4*PI);
		}
		System.out.println("Pi je priblizno jednako: "+4*PI);
		System.out.println(Math.PI);
	}

}
