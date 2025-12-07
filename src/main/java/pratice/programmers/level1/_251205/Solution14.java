package main.java.pratice.programmers.level1._251205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 🟡 문제 14 — 배열의 중복 제거 (순서 유지)
 * 입력 예시: [1, 3, 3, 2, 1, 4]
 * 출력 예시: [1, 3, 2, 4]
 *
 * 🎯 포인트
 * 1,0,음수 예외 처리
 * sqrt(n)까지 검사 → 효율성 기본기
 * 나누어떨어지는지 체크
 * */
public class Solution14 {
	
	public static void main(String[] args){
		
		int[] arr = {1,3,3,2,1,4};
		
		System.out.println(Arrays.toString(removeDuplicates(arr)));
	}
	
	public static int[] removeDuplicates2(int[] arr) {
		return Arrays.stream(arr).boxed().toList().stream().distinct().toList().stream().mapToInt(i -> i).toArray();
	}
	
	public static int[] removeDuplicates(int[] arr) {
		//  null 체크 중요
		if (arr == null || arr.length == 0) return new int[0];
		
		List<Integer> list = new ArrayList<>();
		
		list.add(arr[0]);
		
		for(int i = 1; i < arr.length; i++){
			if(list.contains(arr[i]))continue;
			
			list.add(arr[i]);
		}
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++){
			result[i] = list.get(i);
		}
		return result;
	}
}
