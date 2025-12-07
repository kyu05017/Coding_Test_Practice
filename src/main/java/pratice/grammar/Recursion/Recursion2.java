package main.java.pratice.grammar.Recursion;

// 재귀로 출력

public class Recursion2 {
	public static void main(String[] args) {
		printFrom1ToN(5);
		printFrom1ToN1(5);
		// 출력: 1 2 3 4 5
	}
	
	// 내림차순
	static void printFrom1ToN1(int n) {
		// 여기 재귀로 구현해봐!
		if(n == 0){
			return;
		}
		System.out.println(n);
		printFrom1ToN(n-1);
	}
	// 오름차순
	static void printFrom1ToN(int n) {
		// 여기 재귀로 구현해봐!
		if(n == 0){
			return;
		}
		System.out.println(n);
		printFrom1ToN(n-1);
	}
}
