package main.java.pratice.programmers.level2._251207;

import java.util.Arrays;

/*
 🔥 [응용 문제 A] 가장 작은 수 만들기 (반대 버전이 아님)
 📘 [문제 1] 가장 작은 수 만들기 (Lv.2 난이도)
 
 정수 배열 numbers가 주어진다.
 이 숫자들을 적절한 순서로 이어붙여 만들 수 있는 가장 작은 수를 문자열로 반환하시오.
 
  ⚠️ 단순히 내림차순 대신 오름차순으로 정렬하면 되는 문제가 아니다.
 마찬가지로
 * 문자열 결합 a+b 와 b+a 를 비교해야 하며
 * 작은 조합을 만드는 쪽을 앞에 두는 정렬 기준을 직접 만들어야 한다.

 입력 : numbers
	[6, 10, 2]
	[3, 30, 34, 5, 9]
	[0, 0, 0]

 출력 : return
 "1026"
 "3033459"
 "0"
 
 🎯 풀이 포인트
 * 정렬할 때 “문자열로 변환한 뒤 비교하는 방식”을 사용해야 한다.
 * 예: "3"과 "30"을 비교할 때
 * "330" vs "303" 을 비교해서 더 큰 쪽이 앞으로 온다.
 
 * */
public class Solution1_1_가장_작은_수_만들기 {
	
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
			System.out.println("a: "+(a));
			System.out.println("b : "+(b));
			System.out.println("a+b : "+(a+b));
			System.out.println("b+a : "+(b+a));
			System.out.println("compareTo : "+(a+b).compareTo(b+a));
			
			if((a+b).compareTo(b+a) > 0){
				System.out.println("a가 앞으로");
			} else if((a+b).compareTo(b+a) == 0){
				System.out.println("유지");
			} else {
				System.out.println("a가 뒤로");
			}
			System.out.println();
			return (a+b).compareTo(b+a);
		});
		
		if(arr[0] == "0"){
			return "0";
		}
		
		for(String s : arr){
			sb.append(s);
		}
		
		return sb.toString();
	}
}
