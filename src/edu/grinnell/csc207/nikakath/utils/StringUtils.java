package edu.grinnell.csc207.nikakath.utils;

import java.lang.reflect.Array;

public class StringUtils {
	
	/*
	 * Author: Kitt Nika
	 */

	public static void main(String[] args) throws Exception {

		java.io.PrintWriter pen;
		pen = new java.io.PrintWriter(System.out, true);
		
		String[] test = splitAt("a:b:c", ':');
		int i;
		for (i = 0; i < Array.getLength(test); i++){
			pen.println(test[i]);
		}
		
		String name = "Shirley";
		nameGame(name);
		
	}

	/* Preconditions: Takes a string of fields that are separated by a character, ch,
	 * which is also inputed.
	 * Postconditions: Returns an array of strings including the fields with the
	 * separation character removed. (Incomplete)
	 */
	
	public static String[] splitAt(String str, char ch) {
		int start, end, k;
		k = 0;
		end = 0;
		String[] split = new String[str.length()];
		
		for (start = 0; start <= str.length(); start++){
			// When you hit the dividing character, place the section before it into the
			//  array to be returned and update the counts and place holders
			if (str.charAt(start) != ch){
				split[k] = str.substring(start, end);
				k++;
				end = start;
				} //if
			
			} //for
		
		return split;
		
	} //splitAt(String, char)
	
	/* Preconditions: Takes a string of fields that are separated by commas and returns an array of strings
	 * containing the fields.  If a comma occurs between two quotation marks, it is left alone.  If a quote
	 * appears between two quotation marks, it is treated as a single character and is left alone.
	 * Postconditions: Returns an array of strings including the fields with the commas removed. (Incomplete)
	 */
	
	public static String[] splitCVS(String str, char ch) {
		String[] split = new String[str.length()];
		return split;
	} //splitCVS(String, char)
	
	/* Preconditions: Nothing notable.
	 * Postconditions: Returns a "deleeted" version of the input string,
	 * where symbols representing letters in the 133+ alphabet are
	 * replaced by their true English alphabetic signifiers.
	 */
	
	public static String deLeet(String str){
		String deLeeted = str;
		String deLeeted1 = deLeeted.replace("|\\|", "n");
		String deLeeted2 = deLeeted1.replace("1", "l");
		String deLeeted3 = deLeeted2.replace("|3", "b");
		String deLeeted4 = deLeeted3.replace("0", "o");
		String deLeeted5 = deLeeted4.replace("@", "a");
		String deLeeted6 = deLeeted5.replace("+", "t");
		String deLeeted7 = deLeeted6.replace("3", "e");
		return deLeeted7;
	} //deLeet(String)
	
	/* Preconditions: Takes a string representing a name.  Does not work if the name starts with a vowel or 'y'.
	 * Postconditions: Prints a silly verse with the original name inserted and modified in different ways.
	 */
	
	public static void nameGame(String name){
		int i;
		
		// Find the index at which the first vowel occurs
		for (i = 0; i < name.length(); i++){
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' ||
					name.charAt(i) == 'u' || name.charAt(i) == 'y'){
				break;
				}
			}
		
		// String to insert into appropriate places in verse
		String newname = name.substring(i);
		
		// Set up something to print with		
		java.io.PrintWriter pen;
		pen = new java.io.PrintWriter(System.out, true);
		
		// Print the verse
		pen.println(name + "!");
		pen.println(name + ", " + name + " bo B" + newname + " Bonana fanna fo F" + newname);
		pen.println("Fee fy mo M" + newname + ", " + name + "!");
		
	} //nameGame(String)
	
} //StringUtils
