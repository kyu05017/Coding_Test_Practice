package main.java.pratice.grammar.Recursion;

// ▶ 재귀 응용 문제 4 — 배열의 합 구하기
public class Recursion6 {
	
	public static void main(String[] args) {
		int result = printReverse(new int[]{1,2,3,4},0);
		System.out.println(result);
	}
	
	static int printReverse(int[] arr, int idx){
		if(idx == arr.length)return 0 ;
		return arr[idx] + printReverse(arr,idx+1);
	}
}
