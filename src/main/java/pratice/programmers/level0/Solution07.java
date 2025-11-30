package main.java.pratice.programmers.level0;

/*
 * 🟠 문제 7 — 배열 뒤집기(직접 구현)
 * 입력 예시: [1,2,3,4,5]
 * 출력 예시: [5,4,3,2,1]
 *
 * 🎯 포인트
 * swap 패턴
 * 투포인터 기반 구현
 * */
public class Solution07 {
	
	public static void main(String[] args){
		int[] tg = {1,2,3,4,5};
		int[] arr = reverseArray(tg);
		System.out.println();
	}
	
	public static int[] reverseArray(int[] arr) {
		if(arr == null || arr.length==0)return new int[0];
		
		int[] result = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) result[i] = arr[arr.length-1-i];
		
		return result;
	}
}
