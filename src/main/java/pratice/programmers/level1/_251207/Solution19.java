package main.java.pratice.programmers.level1._251207;

/*
 *🟠  문제: 문자열 압축 (확장 버전)
문자열이 주어질 때,
연속된 문자를 "문자 + 반복 횟수" 형태로 압축하여 반환하라.

조건: "aaabbcaaa" → "a3b2c1a3"

마지막 문자도 반드시 포함
빈 문자열 → 빈 문자열 반환
공백 " " 도 문자로 처리함
 * */
public class Solution19 {
	
	public static void main(String[] args){
		
		System.out.println(compress("aaabbcaaa"));
	}
	
	@SuppressWarnings("all")
	public static String compress(String str) {
		if(str == null || str.length() == 0)return "";
		
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i = 0; i < arr.length-1; i++){
			
			
			char now = arr[i];
			char next = arr[i+1];
			
			if(now == next){
				cnt++;
			} else {
				cnt += 1;
				sb.append(now).append(cnt);
				cnt = 0;
			}
		}
		
		if(cnt > 0){
			cnt ++;
			sb.append(arr[arr.length-1]).append(cnt);
		}
		
		return sb.toString();
	}
}
