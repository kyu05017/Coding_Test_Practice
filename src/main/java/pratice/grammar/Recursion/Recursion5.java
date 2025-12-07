package main.java.pratice.grammar.Recursion;

// 재귀 응용 문제 3 — 배열을 뒤에서부터 출력하기
public class Recursion5 {
	
	public static void main(String[] args) {
		printReverse(new int[]{10,20,30},3);
	}
	
	static void printReverse(int[] arr, int idx){
		if(idx == 0)return;
		
		System.out.println(arr[idx-1]);
		printReverse(arr,idx-1);
	}
}
