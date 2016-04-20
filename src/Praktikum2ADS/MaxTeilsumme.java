package Praktikum2ADS;

public class MaxTeilsumme {

	public MaxTeilsumme() {
		// TODO Auto-generated constructor stub
		
	}
	public int maxTeilsumme2(int[] array){
		//max innerhalb des Arrays
		int max = 0;
        //max bis zum rechten Rand des Arrays
        int maxright=0;
        //O(n)
        for (int i = 0; i < array.length; i++) {
        	//maximum pro position bis zum rechten Rand ermitteln
        	maxright = Math.max(maxright+array[i],0);
        	//maximum von max_innerhalb und max_rechts ermitteln = maxTeilsumme
        	max = Math.max(max,maxright);
        } 
        return max;
	}
}
