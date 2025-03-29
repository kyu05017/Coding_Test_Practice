package 프로그래머스.단계별풀이.기초단계;

public class _008_나머지가_1이_되는_수_찾기 {

	/**
	 ✅ 반복문	2부터 n-1까지 순차 탐색
	 ✅ 조건문	n % i == 1 체크 정확
	 ✅ 즉시 리턴	가장 작은 값만 찾으면 되므로 효율적
	 ✅ 깔끔한 흐름	불필요한 조건 없음
	 */
	public static void main(String[] args) {
		System.out.println(solution(12));
	}

	// 내풀이
	public static int solution(int n) {
		int answer = 0;
		for(int i = 2; i < n; i++){
			if(n % i == 1){
				return i;
			}
		}
		return answer;
	}

	// 더 간결하게 풀기
	public static int sol1(int n){
		for(int i = 2; i < n; i++){
			if(n%i==i)return i;
		}
		return -1;
	}
}
