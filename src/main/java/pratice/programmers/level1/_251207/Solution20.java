package main.java.pratice.programmers.level1._251207;

import java.util.ArrayList;
import java.util.List;

/*
 *🟠 랜덤 복습 & 심화 문제 — 회문(팰린드롬) 확장판
 *
 * "A man, a plan, a canal: Panama" → true
 * "race a car" → false
 * "No 'x' in Nixon" → true
 *
 * 🎯 포인트
 * 문자열에서 유효한 문자만 필터링해서 새 문자열을 만들기
 * lowerCase()
 * 투포인터로 앞뒤 비교
 * i < j 동안 검사
 * 하나라도 다르면 즉시 false 반환
 * */
public class Solution20 {
	
	public static void main(String[] args){
		
		System.out.println(isCleanPalindrome("A man, a plan, a canal: Panama"));
	}
	
	@SuppressWarnings("all")
	public static boolean isCleanPalindrome(String str) {
		if(str == null || str.length() == 0)return false;
		
		char[] arr = str.toCharArray();
		List<Character> list = new ArrayList<>();
		
		for(char i : arr)
			//isLetterOrDigit 로 사용권고/ 현재 로직은 숫자는 제외되는 로직임
			if(Character.isAlphabetic(i)) list.add(Character.toLowerCase(i));
		
		// 전처리 후 리스트가 비어있는 경우를 제외하지 않음
		if (list.size() == 0) return false;
		
		int i = 0;
		int j = list.size()-1;
		
		while(i < j){
			
			if(list.get(i) != list.get(j)){
				return false;
			}
			
			i++;
			j--;
		}
		
		
		return true;
	}
}
