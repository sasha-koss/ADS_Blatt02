package Praktikum2ADS;

public class MaxTeilsumme {

	public MaxTeilsumme() {
		// TODO Auto-generated constructor stub
		
	}
	public int maxTeilsumme2(int[] array){
        int max = 0;
        int maxright=0;
        for (int i = 0; i < array.length; i++) {
        	maxright = Math.max(maxright+array[i],0);
        	max = Math.max(max,maxright);
        } 
        return max;
	}
}
