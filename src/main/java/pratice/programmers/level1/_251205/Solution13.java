package main.java.pratice.programmers.level1._251205;

/*
 * 🟡 문제 13 — 두 수 a, b 사이의 합 구하기
 * 입력 예시: a = 1, b = 5 → 1+2+3+4+5 = 15
 * 입력 예시: a = 5, b = 1 → 1+2+3+4+5 = 15
 *
 * 🎯 포인트
 * 1,0,음수 예외 처리
 * sqrt(n)까지 검사 → 효율성 기본기
 * 나누어떨어지는지 체크
 * */
public class Solution13 {
	
	public static void main(String[] args){
		System.out.println(sumBetween(1,5));
	}
	
	public static long sumBetween2(int a, int b) {
		int max = Math.max(a,b), min = Math.min(a,b);
		
		long result = 0;
		
		for(int i = min; i <= max; i++)
			result += i;
		
		return result;
	}
	
	public static long sumBetween(int a, int b) {
		int max = Math.max(a,b), min = Math.min(a,b);
		
		return ((long) (max - min + 1) * (min + max)) / 2;
	}
}
