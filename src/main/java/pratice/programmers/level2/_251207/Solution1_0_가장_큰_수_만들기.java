package main.java.pratice.programmers.level2._251207;

import java.util.Arrays;

/*
 🔥 2단계 문제 1번
 📘 [문제 1] 가장 큰 수 만들기 (Lv.2 난이도)
 
 정수 배열 numbers가 주어졌을 때,
 배열의 수들을 이어붙여 만들 수 있는 가장 큰 수를 문자열로 반환하시오.
 
 📝 조건
  * numbers의 길이: 1 이상 100,000 이하
  * 각 원소는 0 이상 1,000 이하의 정수
  * 이어붙인 결과가 "0000…" 형태라면 "0"을 반환해야 함
  * 정렬 기준이 핵심

 입력 : numbers
	[6, 10, 2]
	[3, 30, 34, 5, 9]
	[0, 0, 0]

 출력 : return
 "6210"
 "9534330"
 "0"
 
 🎯 풀이 포인트
 * 정렬할 때 “문자열로 변환한 뒤 비교하는 방식”을 사용해야 한다.
 * 예: "3"과 "30"을 비교할 때
 * "330" vs "303" 을 비교해서 더 큰 쪽이 앞으로 온다.
 
 * */
public class Solution1_0_가장_큰_수_만들기 {
	
	public static void main(String[] args){
		
		System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
	}
	
	@SuppressWarnings("all")
	public static String solution(int[] numbers) {
		if(numbers == null || numbers.length == 0)return "";
		
		StringBuilder sb = new StringBuilder();
		String[] arr = new String[numbers.length];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr,(a, b)-> {
			// a가 앞이어야 하면 음수
			// 같으면 0
			// b가 앞이어야 하면 양수
			return (b+a).compareTo(a+b);
		});
		
		if(arr[0] == "0"){
			return "0";
		}
		
		for(String s : arr){
			System.out.println(s);
			sb.append(s);
		}
		
		return sb.toString();
	}
}
