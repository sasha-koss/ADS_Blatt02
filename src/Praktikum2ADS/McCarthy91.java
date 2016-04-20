package Praktikum2ADS;

public class McCarthy91 {
	
	public McCarthy91() {
		// TODO Auto-generated constructor stub
	}
	
    public int doMcCarthy91(int value) {
    	   if (value > 100) {
               return (value - 10);
           }
           return mcCarthy(mcCarthy(value + 11));
    }
 
    public int mcCarthy(int n) {
        if (n > 100) {
            return (n - 10);
        }
        return mcCarthy(mcCarthy(n + 11));
    }
}
