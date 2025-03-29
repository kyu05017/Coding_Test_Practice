package 프로그래머스.단계별풀이.기초단계;

public class _007_제곱근_판별 {

	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	// 오답
	public static long solution(long n) {
		// 이유 제곱근이 정수인지 판별하는 로직이 틀림
		return (long)Math.sqrt(n) > 1 ? (long)Math.pow((long)Math.sqrt(n),2) : -1;
	}

	// 수정 1
	public static long sol2 (long n){
		return ((long)Math.sqrt(n) * (long)Math.sqrt(n) == n)? (long)Math.pow((long)Math.sqrt(n),2) : -1;
	}

	// 개선 1
	public static long sol3(long n){
		long sq = (long)Math.sqrt(n); // 중복적인 계산 방지
		long re = (sq + 1);
		return (sq * sq == n) ?
				re * re // 함수를 사용하는 것보다 빠르고 안전성이 높다.
				: -1;
	}
}
