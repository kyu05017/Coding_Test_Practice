package main.java.pratice.programmers.level0._251130;

/*
 * 🟡 문제 6 — 문자열 속 특정 문자 개수 구하기
 * 입력 예시: "banana", 'a'
 * 출력 예시: 3
 *
 * 🎯 포인트
 * char 비교
 * null 체크, empty 체크
 * */
public class Solution06 {
	
	public static void main(String[] args){
		
		System.out.println(countChar("banana", 'a'));
	}
	
	public static int countChar(String str, char target){
		if(str == null || str.length() == 0) return 0;
		
		int result = 0;
		
		char[] arr = str.toCharArray();
		for(char c : arr){
			if(c == target){
				result++;
			}
		}
		
		return result;
	}
}
