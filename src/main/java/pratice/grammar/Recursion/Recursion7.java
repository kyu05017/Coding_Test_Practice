package main.java.pratice.grammar.Recursion;

public class Recursion7 {
	
	public static void main(String[] args) {
		System.out.println(reverse("abcd"));
	}
	
	static String reverse(String s){
		if(s.isEmpty())return "";
		return reverse(s.substring(1))+s.charAt(0);
	}
}
