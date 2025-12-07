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
		
		char[] arr = str.toCharArray();
		boolean result = false;
		int j = arr.length-1;
		
		for(int i = 0; i < arr.length; i++){
			
			char start = Character.toLowerCase(arr[i]);
			char end = Character.toLowerCase(arr[j]);
			
			if(i != j){
				if(start == end)result = true;
			} else break;
			
		}
			j--;
		
		
		return result;
	}
}
