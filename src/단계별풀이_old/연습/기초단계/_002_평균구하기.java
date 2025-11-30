package 단계별풀이_old.연습.기초단계;

import java.util.Arrays;

public class _002_평균구하기 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,4,5}));
	}

	/**
	 * ✅ 반복문	배열의 합을 잘 구함
	 * ✅ 형 변환	int → double 캐스팅으로 소수점 손실 없이 평균 계산
	 * ✅ 반환	정확하게 double 리턴
	 */
	// 기본형
	public static double solution(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++){
			temp += arr[i];
		}
		return (double) temp/arr.length;
	}

	// 자바 스트림
	public static double solution2(int[] arr) {
		return Arrays
				.stream(arr) // 받은 arr를 스트림화
				.average()// 평균 값 반환
				.orElse(0);// 값이 있으면 반환 없으면 기본값 반환;
	}
}
