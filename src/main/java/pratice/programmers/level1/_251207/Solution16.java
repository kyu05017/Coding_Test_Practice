package main.java.pratice.programmers.level1._251207;

import java.util.ArrayList;
import java.util.List;

/*
 * 🟠 문제 16 — 가장 긴 연속 문자 길이 구하기
 * 문자열이 주어질 때, 같은 문자가 연속으로 반복되는 가장 긴 구간의 길이를 구해라.
 * 입력 예시: "aaabbccccccde" → 연속 "cccccc" → 6
 * 입력 예시: "aabbbaa" → "bbb" → 3
 *
 * 🎯 포인트
 * 1,0,음수 예외 처리
 * sqrt(n)까지 검사 → 효율성 기본기
 * 나누어떨어지는지 체크
 * */
public class Solution16 {
	
	public static void main(String[] args){
		System.out.println(longestSequence("aabbbaa"));
	}
	
	@SuppressWarnings("all")
	public static int longestSequence1(String str) {
		
		if(str == null || str.length() == 0)return 0;
		
		int cnt = 0;
		int max = cnt;
		char[] arr = str.toCharArray();

		// 마지막 케이스를 놓치는 케이스가 발생해서 결함 발생
		for(int i = 0; i < arr.length -1; i++){
			char now = arr[i];
			char next = arr[i+1];
			
			if(now == next){
				cnt++;
			} else {
				cnt += 1;
				
				if(max < cnt)max = cnt;
				
				cnt = 0;
			}
		}
		return max;
	}
	
	@SuppressWarnings("all")
	public static int longestSequence(String str) {
		if (str == null || str.length() == 0) return 0;
		if (str.length() == 1) return 1;
		
		char[] arr = str.toCharArray();
		int cnt = 1;           // 현재 연속 길이
		int max = 1;           // 최대 연속 길이
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				cnt++;
			} else {
				cnt = 1;
			}
			if (max < cnt) max = cnt;
		}
		
		return max;
	}
}
