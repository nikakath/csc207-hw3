package edu.grinnell.csc207.nikakath.utils;

public class StringUtils {

	public static void main(String[] args) throws Exception {

		java.io.PrintWriter pen;
		pen = new java.io.PrintWriter(System.out, true);
		String name = "Shirley";
		nameGame(name);
		
	}

	public static String[] splitAt(String str, char ch) {
		int i;
		String[] split = new String[str.length()];
		
		for (i = 0; i <= str.length(); i++){
			if (str.charAt(i) != ch){
				
				} //if
			
			} //for
		
		return split;
		
	} //splitAt
	
	public static String[] splitCVS(String str, char ch) {
		int i;
		String[] split = new String[str.length()];
		
		for (i = 0; i <= str.length(); i++){
			if (str.charAt(i) != ch){
				
				} //if
			
			} //for
		
		return split;
		
	} //splitCVS
	
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
	} //deLeet
	
	public static void nameGame(String name){
		int i;
		
		for (i = 0; i < name.length(); i++){
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' ||
					name.charAt(i) == 'u' || name.charAt(i) == 'y'){
				break;
				}
			}
		String newname = name.substring(i);		
		java.io.PrintWriter pen;
		pen = new java.io.PrintWriter(System.out, true);
		pen.println(name + "!");
		pen.println(name + ", " + name + " bo B" + newname + " Bonana fanna fo F" + newname);
		pen.println("Fee fy mo M" + newname + ", " + name + "!");
		
	} //nameGame
	
} //StringUtils
