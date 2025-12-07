package main.java.pratice.programmers.level1._251207;

import java.util.*;

/*
 * 🟠 문제 17 — 배열에서 특정 값의 모든 인덱스 찾기
 * 정수 배열과 특정 숫자 target이 주어졌을 때, 배열 안에서 target이 등장하는 모든 인덱스를 배열로 반환하라.
 * 입력 예시: arr = [1, 3, 5, 3, 7, 3], target = 3
 * 출력 예시 : [1, 3, 5]
 *
 * 🎯 포인트
 * 1,0,음수 예외 처리
 * sqrt(n)까지 검사 → 효율성 기본기
 * 나누어떨어지는지 체크
 * */
public class Solution17 {
	
	public static void main(String[] args){
		
		
		System.out.println(Arrays.toString(findIndexes(new int[]{1, 3, 5, 3, 7, 3},3)));
	}
	
	@SuppressWarnings("all")
	public static int[] findIndexes(int[] arr, int target) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				list.add(i);
			}
		}
		
		return (list.size() > 0)? list.stream().mapToInt(i -> i).toArray() : new int[]{};
	}
}
