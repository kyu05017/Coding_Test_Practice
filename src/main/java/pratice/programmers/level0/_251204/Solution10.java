package main.java.pratice.programmers.level0._251204;

/*
 * 🟡 문제 10 — 문자열 압축(기초 구현 버전)
 * 입력 예시: "aaabbca"
 * 출력 예시: "a3b2c1a3"
 *
 * 🎯 포인트
 * 이전 문자 저장 패턴
 * count 증가 패턴
 * 마지막 문자 처리 주의
 * */
public class Solution10 {
	
	public static void main(String[] args){
		
		System.out.println(compress("aaabbcaaa"));
	}
	
	public static String compress(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			char now_c = arr[i], next_c = arr[i + 1];
			
			if (now_c == next_c) cnt++;
			else {
				sb.append(cnt + 1).append(now_c);
				cnt = 0;
			}
		}
		if(cnt > 0)
			sb.append(arr[arr.length-1]).append(cnt+1);
		else
			sb.append(arr[arr.length-1]).append("1");
		
		return sb.toString();
	}
}
