package 단계별풀이_old.연습.기초단계;

public class _003_짝수홀수 {
	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	/**
	 ✅ 짝수/홀수 판단	% 2 연산으로 정확하게 처리
	 ✅ 삼항 연산자	조건문 없이 깔끔하게 구현
	 ✅ 리턴값	문제 요구대로 "Even" / "Odd" 잘 반환
	 */
	public static String solution(int num) {
		return (num%2!=0) ? "Odd" : "Even";
	}

	// 가독성 측면에서는 짝수인 케이스를 먼저 체크하는게 좋다
	public static String solution2(int num) {
		return (num % 2 == 0) ? "Even" : "Odd";
	}
}
