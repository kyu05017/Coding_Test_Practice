package 단계별풀이._25년_04월.복습및풀이_250428._01_시간복잡도;

public class _001_01_시간복잡도 {
	public static void main(String[] args) {

		/**
		 *
		 * 100,000,000 == 1초 로 간주
		 *
		 * 빅-오메가 : 최선일 때의 연산 횟수를 나타낸 표기법
		 * 빅-세타   : 보통일 때의 연산 횟수를 나타낸 포기법
		 * 빅-오     : 최악일 때의 연산 횟수를 나타낸 표기법
		 *
		 * 밑의 코드
		 * 빅-오메 : 1
		 * 빅-세타 : N/2
		 * 빅-오   : N
		 *
		 * ※ 코딩 테스트는 빅-오 표기법으로 수행 시간을 계산 하는 것이 좋다.
		 */

		// 1 ~ 100 사이 랜덤 한 값 선택
		int findNumber = (int)(Math.random() * 100);

		for(int i = 0; i < 100; i++) {
			if (i == findNumber) {
				System.out.println(i);
				break;
			}
		}
	}
}
