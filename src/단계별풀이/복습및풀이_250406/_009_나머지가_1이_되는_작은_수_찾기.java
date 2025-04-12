package 단계별풀이.복습및풀이_250406;

public class _009_나머지가_1이_되는_작은_수_찾기 {
	public static void main(String[] args) {

	}

	// 내풀이 - 내림차순 + 버블정렬
	public int solution(int n) {
		/**
		 * 느낀점 :
		 * 처음에는 조금 막혔었다, 하지만 받은 숫자 (ex: 10 -> 1)
		 * 까지 내려가면서 나눌경우를 생각하고
		 * 버블 정렬을 사용해서 최소 값을 치환 해보자 생각
		 *
		 * 풀이 :
		 * 받은 수 n부터 1까지 내려가면서
		 * 차감되는 i수를 n과 나눠서 나머지가 1이 되는 경우를
		 * 구하고 미리 선언해둔 min 값과 비교해서
		 * 버블 정렬로 치환한다.
		 * */
		int min = n;
		for(int i = n; i > 0; i--){
			if(n % i == 1){
				if(min > i){
					min = i;
				}
			}
		}
		return min;
	}

	// 오름 차순 + 조기종료
	public int solution2(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 1) return i;
		}
		return -1; // 예외 상황 없지만 명시적으로 처리
	}
}
