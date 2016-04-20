
public class McCarthy91 {
	
	public McCarthy91() {
		// TODO Auto-generated constructor stub
	    McCarthy91 mcCarthyNewObject = new McCarthy91();
	    McCarthy91 mcCarthyNewObject99 = new McCarthy91();
	    McCarthy91 mcCarthyNewObject100 = new McCarthy91();
	    McCarthy91 mcCarthyNewObject101 = new McCarthy91();
	 
	    System.out.println("McCarthy91-Funktion mit n = -100.000:\n");
	    System.out.println(mcCarthyNewObject.mcCarthy(-100000));
	    System.out.println("____________________________");
	    System.out.println("McCarthy91-Funktion mit n = -100:\n");
	    System.out.println(mcCarthyNewObject.mcCarthy(-100));
	    System.out.println("____________________________");
	    System.out.println("McCarthy91-Funktion mit n = -1:\n");
	    System.out.println(mcCarthyNewObject.mcCarthy(-1));
	    System.out.println("____________________________");
	    System.out.println("McCarthy91-Funktion mit n = 0:\n");
	    System.out.println(mcCarthyNewObject.mcCarthy(0));
	    System.out.println("____________________________");
	    System.out.println("McCarthy91-Funktion mit n = 1:\n");
	    System.out.println(mcCarthyNewObject.mcCarthy(1));
	    System.out.println("____________________________");
	    System.out.println("\nMcCarthy91-Funktion mit n = 99:\n");
	    System.out.println(mcCarthyNewObject99.mcCarthy_mitCounter(99));
	    mcCarthyNewObject99.counter();
	    System.out.println("____________________________");
	    System.out.println("\nMcCarthy91-Funktion mit n = 100:\n");
	    System.out.println(mcCarthyNewObject100.mcCarthy_mitCounter(100));
	    mcCarthyNewObject100.counter();
	    System.out.println("____________________________");
	    System.out.println("\nMcCarthy91-Funktion mit n = 101:\n");
	    System.out.println(mcCarthyNewObject101.mcCarthy_mitCounter(101));
	    mcCarthyNewObject101.counter();
	    System.out.println("____________________________");
	}
    public int doMcCarthy(int value) {
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
 
    private int count = 0;
 
    public int mcCarthy_mitCounter(int n) {
 
        if (n > 100) {
            count += 1;
            System.out.println(n);
            return (n - 10);
        }
        count += 1;
        System.out.println(n);
        return mcCarthy_mitCounter(mcCarthy_mitCounter(n + 11));
    }
 
    public void counter() {
        System.out.println("\nAnzahl der Rekursionsdurchläufe: " + count);
    }
 
}
