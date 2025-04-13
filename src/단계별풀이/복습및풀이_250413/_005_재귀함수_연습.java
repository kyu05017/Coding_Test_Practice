package 단계별풀이.복습및풀이_250413;

public class _005_재귀함수_연습 {
	public static void main(String[] args) {
		System.out.println("최종 : " + factorial(2));
		countdown(2);
		printNumbers(3);
	}

	private static int factorial(int n) {
		System.out.println(n);
		// 종료 조건 n이 1보다 작거나 같을 경우
		if (n <= 1) return 1;
		return n * factorial(n - 1);
	}

	// 무한루프 : 종료조건 필요
	private static void hello() {
		System.out.println("hi");
		hello();
	}

	// 큰 틀
	// 기저 조건 + 자기 호출
	static void countdown(int n) {
		if (n == 0) {
			System.out.println("Boom!");
			return; // 기저 조건
		}
		System.out.println(n);
		countdown(n - 1); // 자기 자신 호출
	}

	// 1 ~ n 까지 재귀로
	private static void printNumbers(int n) {
		if (n == 0) return;
		printNumbers(n - 1);
		System.out.println(n);
	}
}
