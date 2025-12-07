package main.java.pratice.programmers.level1._251205;

/*
 * 🟡 문제 15 — 1부터 N까지 소수 개수 세기
 * 입력 예시: N = 10 → 소수: 2,3,5,7 → 4
 * 입력 예시: N = 5 → 소수: 2,3,5 → 3
 *
 * 🎯 포인트
 * 1,0,음수 예외 처리
 * sqrt(n)까지 검사 → 효율성 기본기
 * 나누어떨어지는지 체크
 * */
public class Solution15 {
	
	public static void main(String[] args){
		System.out.println(countPrimes(10));
	}
	
	public static int countPrimes(int n) {
		int cnt = 0;
		for(int i = 2; i <= n; i ++)
			if(isPrimeYn(i)) cnt++;
		
		return cnt;
	}
	
	private static boolean isPrimeYn2(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	// 개선
	private static boolean isPrimeYn(int n) {
		if (n <= 1) return false;
		if (n == 2) return true;
		
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
