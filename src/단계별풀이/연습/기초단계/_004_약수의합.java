package 단계별풀이.연습.기초단계;

import java.util.stream.IntStream;

public class _004_약수의합 {
	public static void main(String[] args) {
		System.out.println(solution(33));
	}
	/**
	 ✅ for문	1부터 n까지 완전 탐색
	 ✅ 조건문	n % i == 0이면 약수
	 ✅ 누적합	약수일 때만 더함
	 */
	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				answer += i;
			}
		}
		return answer;
	}

	/**
	 간결하고 가독성 높음
	 조건 필터링 → 가공 → 결과 집계가 직관적임
	 코테나 실무 코드에서 “클린 코드” 느낌 낼 수 있음 😎
	 */
	public static int solution2(int n) {
		return IntStream
				.range(1,n) // 1부터 n까지 정수 스트림 생성
				.filter(i -> n % i == 0) // 약수조건 ( i를 n으로 나머지 계산을 했을때 0으로 떨어지는가?)
				.sum(); // 전부 더해서 리턴
	}
	// toArray() 쓰면 약수 배열도 구할 수 있음
	public static int[] solution3(int n) {
		return IntStream
				.range(1,n) // 1부터 n까지 정수 스트림 생성
				.filter(i -> n % i == 0) // 약수조건 ( i를 n으로 나머지 계산을 했을때 0으로 떨어지는가?)
				.toArray(); // 전부 더해서 리턴
	}
}
