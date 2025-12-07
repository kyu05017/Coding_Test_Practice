package main.java.pratice.grammar.Recursion;

// 👉 재귀 응용 1 — 1부터 N까지의 합 만들기
public class Recursion3 {

	public static void main(String[] args) {
		System.out.println("1부터 N까지의 합:"+sumN(1));
	}
	
	static int sumN(int n){
		if(n == 0){
			return 0;
		}
		return n + sumN(n-1);
	}
}
