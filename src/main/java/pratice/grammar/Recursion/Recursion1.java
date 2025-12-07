package main.java.pratice.grammar.Recursion;

// 수의 합
public class Recursion1 {
	public static void main(String[] args) {
		System.out.println("반복문 버전 : "+sumLoop(3));
		System.out.println("반복문 버전 : "+sumRec(3));
	}
	private static int sumLoop(int n){
		if(n == 0 || n == 1) return n;
		
		int result = 0;
		
		for(int i = 1; i <=n; i++){
			result += i;
		}
		return result;
	}
	private static int sumRec(int n){
		if(n == 0){
			return 0;
		}
		System.out.println(n + " + sumRec("+(n-1)+")");
		return n + sumRec(n-1);
	}
}
