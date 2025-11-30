package main.java.pratice.programmers.level0;

/*
 * 🟠 문제 8 — 문자열 속 숫자만 추출해서 합 구하기
 * 입력 예시: "a1b2c3"
 * 출력 예시: 6
 *
 * 🎯 포인트
 * Character.isDigit()
 * char - '0' 변환 패턴
 * 문자열 순회
 * */
public class Solution08 {
	
	public static void main(String[] args){
		
		System.out.println(sumDigits("a1b2c3"));
	}
	
	public static int sumDigits(String str){
		if(str == null || str.length() == 0) return 0;
		
		int result = 0;

		char[] arr = str.toCharArray();
		for(char c : arr) if(Character.isDigit(c)) result++;
		
		return result;
	}
}
