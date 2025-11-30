package old.단계별풀이_old._25년_04월.복습및풀이_250418;

import java.util.Arrays;

public class _002_복습_H_Index_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{5, 5, 5, 5}));
	}
	private static int solution(int[] citations){
		int answer = 0;

		// 오름 차순 정렬
		Arrays.sort(citations);
		/**
		// 내림차순 버전 : 인용수가 논문 번호 보다 작거나 같은것을찾는것
		// 논문의 인덱스
		int j = 1;
		// 인덱스의 마지막 까지 따라기 위해 >=
		for(int i = citations.length-1; i >= 0; i--){
			System.out.println("i : "+i);
			int tmp = citations[i];
			System.out.println("인용 수 : "+ tmp);
			System.out.println("논문 번호 : "+j);
			if(tmp >= j){
				System.out.println("    인용 수가 논문 번호 보다 작거나 같다!");
				answer++;
			}
			j++;
		}

		 오름차순 버전 실패
		int idx = citations.length-1;
		for(int i = 0; i < citations.length; i++){
			int tmp = citations[i];


			if(tmp >= idx){
				answer++;
			}
			idx--;
		}
		 */
		// 오름차순 버전 조건에 만족하는 최대 값이 h-index 가 되는것
		int n = citations.length;
		for (int citation : citations) {
			int h = n - 1;
			if (citation >= h) {
				return h;
			}
		}


		return answer;
	}
}
