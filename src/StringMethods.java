/*
 * 
 *  @author amandabcampos
 *
 */

public class StringMethods {
	
	public static String capitalize(String word) {
		return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	}
	
	public static int wheresWaldo(String phrase) {
		return phrase.indexOf("Waldo");
	}
	
	public static String firstThingsFirst(String a, String b) {
		if (a.charAt(0) > b.charAt(0)) {
			return b + " " + a;
		} 
		return a + " " + b;
	}
	
	public static String reverse(String s) {
		String reversed = "";
		for (int i = s.length() - 1; i > -1; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	
	public static void soLong(String a, String b) {
		if (a.length() > b.length()) {
			System.out.println(a);
		} else if (a.length() < b.length()) {
			System.out.println(b);
		} else {
			System.out.println(a + " " + b);
		}
	}
	
	public static String afterMath(String phrase) {
		int index = phrase.indexOf("math");
		if (index > 0){
			return phrase.substring(index);
		}
		return "dud";
	}
	
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	public static void camelCase(String phrase) {
		String[] words = phrase.split(" ");
		String camelCasePhrase = words[0];
		for (int i = 1; i < words.length; i++) {
			camelCasePhrase += capitalize(words[i]);
		}
		System.out.println(camelCasePhrase);
	}

}
