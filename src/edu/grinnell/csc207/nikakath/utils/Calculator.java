package edu.grinnell.csc207.nikakath.utils;

public class Calculator {

	public static void main(String[] args) throws Exception {

		java.io.PrintWriter pen;
		pen = new java.io.PrintWriter(System.out, true);
		
		pen.println("FIRST TEST");
		for (int i = 0; i < (fewestCoins(28)).length; i++) {
		    pen.print('\n' + (fewestCoins(28))[i] + " ");
		} // for
		pen.println("SECOND TEST");
		for (int i = 0; i < (fewestCoins(20)).length; i++) {
		    pen.print('\n' + (fewestCoins(20))[i] + " ");
		} // for
		// pen.println(28%54);
		
	}

	public static int[] fewestCoins(int i) {
		int[] fewest = new int[20];		
		return fewest;
		
	} //fewestCoins
}
