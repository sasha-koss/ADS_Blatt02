
public class MaxTeilsumme2 {

	public MaxTeilsumme2() {
		// TODO Auto-generated constructor stub
	    int[] list = { 10, 5, -97, 5, 60, 12, 67, 1 };
        int[][] teilsummen = new int[list.length][list.length]; // Aufbau der
                                                                // Matrix
        int aktTeilsumme = 0;
        int maxTeilsumme1 = Integer.MIN_VALUE;
        int maxTeilsumme2 = Integer.MIN_VALUE; // Aufbau der Matrix
        int von1 = 0;
        int bis1 = 0;
        int von2 = 0;
        int bis2 = 0; // Aufbau der Matrix
 
        for (int i = 0; i < list.length; i++) {
            aktTeilsumme = 0;
            for (int j = i; j < list.length; j++) {
                aktTeilsumme += list[j];
                teilsummen[i][j] = aktTeilsumme;
                if (aktTeilsumme > maxTeilsumme1) {
                    maxTeilsumme1 = aktTeilsumme;
                    von1 = i;
                    bis1 = j;
                }
            }
        }
 
        // Max-Teilsummen-Berechnung mit der Matrix
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (teilsummen[i][j] > maxTeilsumme2) {
                    maxTeilsumme2 = teilsummen[i][j];
                    von2 = i;
                    bis2 = j;
                }
            }
        }
 
        // Matrix-Ausgabe
        for (int i = 0; i < list.length; i++) {
            String zeile = "";
            for (int j = 0; j < list.length; j++) {
                zeile += teilsummen[i][j] + " ";
            }
            System.out.println(zeile);
        }
 
        System.out.println("\nMax ohne Matrix: " + maxTeilsumme1);
        System.out.println("Von: " + (von1 + 1));
        System.out.println("Bis: " + (bis1 + 1));
        System.out.println("");
        System.out.println("Max mit Matrix: " + maxTeilsumme2);
        System.out.println("Von: " + (von2 + 1));
        System.out.println("Bis: " + (bis2 + 1));
	}

}
