package main.java.pratice.programmers.level1._251207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *🟠 문제 18 — 문자열 회문 여부 확인 (대소문자 무시)
 * 문자열이 주어졌을 때, 앞뒤가 똑같은 회문인지 판별하라. (대소문자 구분 X)
 * 입력 출력 예시: "Level" → true , "RaceCar" → true , "Hello" → false
 *
 * 🎯 포인트
 * lowerCase()
 * 투포인터 패턴
 * i < j 동안 비교
 * */
public class Solution18 {
	
	public static void main(String[] args){
		
		System.out.println(isPalindrome("Hello"));
	}
	
	@SuppressWarnings("all")
	public static boolean isPalindrome(String str) {
		if(str == null || str.length() == 0)return false;
		String lower = str.toLowerCase();
		int j = lower.length()-1;
		int i = 0;
		
		while (i < j) {
			if (lower.charAt(i) != lower.charAt(j)) {
				return false;          // 하나라도 다르면 바로 false
			}
			i++;
			j--;
		}
		
		return true;// 끝까지 문제 없으면 true
	}
}
