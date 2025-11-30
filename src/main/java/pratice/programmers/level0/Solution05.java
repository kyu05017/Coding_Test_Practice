package main.java.pratice.programmers.level0;

/*
 * 🟡 문제 5 — 배열에서 가장 큰 수와 가장 작은 수 찾기
 * 입력 예시: [3, 1, 9, 2, 6]
 * 출력 예시: {min:1, max:9}
 *
 * 🎯 포인트
 * 반복문에서 초기값 지정 패턴
 * if 기준 비교
 * */
public class Solution05 {
	
	public static void main(String[] args){
		
		int[] arr = new int[]{3, 1, 9, 2, 6};
		int[] re = findMinMax(arr);
		System.out.println(re[0] + " | " +re[1]);
	}
	
	public static int[] findMinMax(int[] arr){
		int[] result = new int[]{0,0};
		if(arr == null || arr.length == 0)return result;
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i : arr){
			if(i < min) min = i;
			if(i > max) max = i;
		}
		result[0] = min;
		result[1] = max;
		
		return result;
	}
}
