package edu.grinnell.csc207.nikakath.utils;

public class Calculator {
	
	/*
	 * Author: Kitt Nika
	 */

	public static void main(String[] args) throws Exception {

		java.io.PrintWriter pen;
		pen = new java.io.PrintWriter(System.out, true);
		
		pen.println("FIRST TEST");
		for (int i = 0; i < 4; i++) {
		    pen.print('\n' + (fewestCoins(28))[i] + " ");
		} // for
		pen.println("\nSECOND TEST");
		for (int i = 0; i < 4; i++) {
		    pen.print('\n' + (fewestCoins(20))[i] + " ");
		} // for
		
	}

	/*
	 * Preconditions: Takes a string representing a simple calculation that can invoke the +, -, *, /, and ^ operators.
	 * Postconditions: Returns the correct answer to the calculation provided, as an integer. (Incomplete)
	 */
	
	public static int calculator(String calc) {
		return 0;
	} //calculator(String)
	
	public static boolean isMultiple(long a, long b){
		if(a == 0)
			return true;
		if(b == 0)
			return false;
		return (a%b == 0);
	} //isMultiple(long,long)
	
	/*
	 * Preconditions: No additional.
	 * Postconditions: Returns an array of integers, the values representing the number of each coin required 
	 * to make the necessary change, so that fewest[0] is the number of wots needed, fewest[1] is the
	 * number of eaters, etc.
	 */
	
	public static int[] fewestCoins(int i) {
		int[] fewest = {0, 0, 0, 0};
		if (isMultiple((long) i, 54)){
			fewest[3] = (i / 54);
			return fewest;
		}
		
		if (isMultiple((long) i, 11)){
			fewest[2] = (i / 11);
			return fewest;
		}
		
		if (isMultiple((long) i, 7)){
			fewest[1] = (i / 7);
			return fewest;
		}
		
		if (isMultiple((long) i, 2)){
			fewest[0] = (i / 2);
			return fewest;
		}
		
		
		
		return fewest;
		
	} //fewestCoins(int)

	/*
	 * Citations: Method isMultiple taken from csc207-hw2 Java package, by Fiona Byrne, 
	 * 			  Justus Goldstein-Shirley, and Kitt Nika found at:
	 * 					https://github.com/nikakath/csc207-hw2
	 */

}//Calculator

