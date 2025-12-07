package main.java.pratice.grammar.Recursion;

// 👉 재귀 응용 2 — 배열을 순차 출력하기
public class Recursion4 {
	public static void main(String[] args) {
		
		printArray(new int[]{10,20,30},0);
	}
	static void printArray(int[] arr, int idx){
		if(idx == arr.length) return;
		
		System.out.println(arr[idx]);
		printArray(arr,idx+1);
	}
	
}
