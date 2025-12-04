package main.java.pratice.programmers.level0._251130;

/*
 * 🟡 문제 4 — 대문자/소문자 변환하기
 * 입력 예시: "HelloWorld"
 * 출력 예시: "hELLOwORLD"
 *
 * 🎯 포인트
 * char 배열
 * Character.isUpperCase()
 * Character.toLowerCase(), toUpperCase()
 * */
public class Solution04 {
	
	public static void main(String[] args){
		System.out.println(swapCase("HelloWorld"));
	}
	
	public static String swapCase(String str){
		if(str == null || str.length() == 0) return "";
		
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : arr){
			if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
			else sb.append(Character.toUpperCase(c));
		}
		return sb.toString();
	}
}
