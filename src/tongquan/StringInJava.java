package tongquan;

public class StringInJava {
	public static void concatString() {
		// string concatenation: 2 ways
		String s = "Hello World!";
		String s1 = s + "b";
		String s2 = s.concat("b"); // .concat() return a new string
		System.out.println(s1); // -> Hello World!b
		System.out.println(s2); // -> Hello World!b
	}

	public static void findCharAtSpecifiedIndex() {
		String s = "Hello World!";
		char c = s.charAt(0);
		System.out.println(c); // -> H
	}

	public static void compareString() {
		// compare 2 strings
		String s = "Hello World!";
		int result = s.compareTo("A");
		System.out.println(result); // -> 7
	}

	public static void findIndexOfString() {
		// find index of string in another string, return -1 if not contain
		String s = "Hello World!";
		int result1 = s.indexOf("o");
		int result2 = s.lastIndexOf("o");
		System.out.println(result1); // -> 4
		System.out.println(result2); // -> 7
	}
	
	public static void replaceString() {
		// replace string in another string
		String s = "Hello World!";
		String result = s.replace("He", "A");
		System.out.println(result); // -> Allo World!
	}
	
	public static void trimString() {
		// remove extra spaces at the beginning and end of string.
		String s = "   Hello    World    !     ";
		String result = s.trim();
		System.out.println(result); // -> "Hello    World    !"
	}
	
	public static void takeSubString() {
		String s = "Welcome to Java!";
		String s1 = s.substring(4);
		String s2 = s.substring(4, 10);
		System.out.println(s1); // -> "ome to Java!"
		System.out.println(s2); // -> "ome to"
	}
	
	public static void characterWrapCalss() {
		boolean result1 = Character.isUpperCase('a'); // -> false
		boolean result2 = Character.isLowerCase('a'); // -> true
		boolean result3 = Character.isDigit('1'); // -> true
	}

	public static void main(String[] args) {
		characterWrapCalss();
	}
}
