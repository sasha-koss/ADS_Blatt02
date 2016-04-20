package Praktikum2ADS;

public class McCarthy91 {
	
	public McCarthy91() {
		// TODO Auto-generated constructor stub
	}
	
    public int doMcCarthy91(int value) {
    	 if (value > 100) {
    	   //M(n) n > 100 	>>>> -10
           return (value - 10);
           }
    	 //M(n) n <= 100 	>>>> (M(M(n+11))
         return doMcCarthy91(doMcCarthy91(value + 11));
    }
}
