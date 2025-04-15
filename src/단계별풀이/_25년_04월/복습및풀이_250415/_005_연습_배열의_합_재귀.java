package 단계별풀이._25년_04월.복습및풀이_250415;

import java.util.Arrays;

public class _005_연습_배열의_합_재귀 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("=== 재귀 시작 ===");
		int sum = sum(arr,0);
		System.out.println("결과 : "+sum);
	}
	static int sum(int[] arr, int idx){
		System.out.println("배열 : "+ Arrays.toString(arr));
		System.out.println("인덱스 : "+idx);

		if(idx == arr.length) {
			System.out.println("    길이가 같음 : 종료");
			return 0;
		}
		System.out.println("--길이가 다름--");
		System.out.println("arr[idx] : "+arr[idx]);
		System.out.println();
		return arr[idx] + sum(arr,idx+1);
	}
}
