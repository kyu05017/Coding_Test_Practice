package main.java.pratice.programmers.level0._251204;

/*
 * 🟡 문제 12 — 주어진 정수가 소수인지 판별하기
 * 입력 예시: 7
 * 출력 예시: true
 *
 * 🎯 포인트
 * 1,0,음수 예외 처리
 * sqrt(n)까지 검사 → 효율성 기본기
 * 나누어떨어지는지 체크
 * */
public class Solution12 {
	
	public static void main(String[] args){
		System.out.println(isPrime(7));
	}
	
	public static boolean isPrime(int n) {
		
		for(int i = 2; i < n; i++){
			if(n % i == 0) return true;
		}
		return false;
	}
}
