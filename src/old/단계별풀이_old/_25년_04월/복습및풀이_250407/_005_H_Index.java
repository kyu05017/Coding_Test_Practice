package old.단계별풀이_old._25년_04월.복습및풀이_250407;

import java.util.Arrays;

public class _005_H_Index {

	public static void main(String[] args) {

	}

	public int solution(int[] citations) {

		int answer = 0;

		/**
		 *느낀점 :
		 * 문제의 요점을 파악하지 못해
		 * H-Index ( H-지수 )를 알아보게 됐음
		 *
		 * H-지수 : 피인용수를 내림 차순으로 두고
		 * “인용수 ≥ 논문 수”가 되는 시점부터 카운트를 하면 된다.
		 * */
		Arrays.sort(citations);

		int idx = 1;
		for(int i = citations.length-1; i >= 0; i--){
			if(citations[i] >= idx){
				answer++;
			}
			idx++;
		}

		return answer;
	}
	// 오름차순 비교 리팩터링
	public int solution1(int[] citations) {
		Arrays.sort(citations);

		int n = citations.length;
		for (int i = 0; i < n; i++) {
			int h = n - i;
			if (citations[i] >= h) {
				return h;
			}
		}
		return 0;
	}
}
