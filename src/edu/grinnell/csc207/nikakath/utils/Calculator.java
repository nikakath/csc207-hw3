package edu.grinnell.csc207.nikakath.utils;

public class Calculator {

	public static void main(String[] args) throws Exception {

		java.io.PrintWriter pen;
		pen = new java.io.PrintWriter(System.out, true);
		pen.println("FIRST TEST");
		for (int i = 0; i < (fewestCoins(28)).length; i++) {
		    pen.println((fewestCoins(28))[i]);
		} // for
		pen.println("SECOND TEST");
		for (int i = 0; i < (fewestCoins(20)).length; i++) {
		    pen.println((fewestCoins(20))[i]);
		} // for
		// pen.println(28%54);
		
	}

	public static int[] fewestCoins(int i) {
		int val = i;
		int j = 0;
		int fewest[] = new int[20];
			
		int two = val % 2;
		int seven = val % 7;
		int eleven = val % 11;
		int fiftyfour = val % 54;
		
		int t = val / 2;
		int s = val / 7;
		int e = val / 11;
		int f = val / 54;
		
		while (val > 0){ 
			
			if (val >= 54){
				val -= 54 * f;
				for (j = j; j < f; j++){
					fewest[j] = 54;
				}
			}
			
			if (val > 11){
				val -= 11 * e;
				for (j = j; j < e; j++){
					fewest[j] = 11;
				}
			}
			
			if (val > 7){
				val -= 7 * s;
				for (j = j; j < s; j++){
					fewest[j] = 7;
				}
			}
			
			if (val > 2){
				val -= 2 * t;
				for (j = j; j < t; j++){
					fewest[j] = 2;
				}
			}
			
		/* while ((val - 54) >= 0){
				val -= 54;
				fewest[j] = 54;
				j++;
				} //if 54
		
		while ((val - 11) >= 0){
				val -= 11;
				fewest[j] = 11;
				j++;
				} //if 11
		
		while ((val - 7) >= 0){
				val -= 7;
				fewest[j] = 7;
				j++;	
				} //if 7
		
		while ((val - 2) >= 0){
				val -= 2;
				fewest[j] = 2;
				j++;
				} //if 2 */
		
		}
		
		return fewest;
		
	} //fewestCoins
}
