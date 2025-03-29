package 프로그래머스.단계별풀이.기초단계;

import java.util.stream.IntStream;

public class _008_두_정수_사이의_합 {


	public static void main(String[] args) {
		System.out.println(solution(3,4));
	}

	// 내풀이 - 오답
	public static int solution(int a, int b) {

		// 오답의 이유 ->
		// 1. range 를 사용하는 경우 a ~ b-1 까지만 만든다.
		// [3 ,4] 3만 사용하게 된다.
		return (a == b)?a:IntStream.range(a,b).sum();
	}

	// 수정 1
	public static long solution1(int a, int b) {
		return IntStream.rangeClosed( // rangeClosed 사용하는 경우 마지막 숫자 까지 포함 된다.
				Math.min(a, b), // 두 수중 작은수를 최소 값으로 잡는다
				Math.max(a, b)) // 두 수중 큰 수를 최대 값으로 잡는다
				.asLongStream() // int로 사용하는 경우 int의 최대값을 넘길수도 있어서 long을 사용
				.sum();         // 합계를 반환
	}

	// 반복문 버전
	public static long sol2(int a, int b){
		long answer = 0;

		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
		return answer;
	}
}
