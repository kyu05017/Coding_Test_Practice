package old.단계별풀이_old._25년_05월.복습및풀이_250503._03_누적합;

import java.util.Arrays;
import java.util.Collections;

public class _002_입문_과일장수 {

	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		System.out.println(solution(k, m, score));
	}
	// 내림차순
	private static void solution1(int k, int m, int[] score){
		int answer = 0;

		// 내림차순 정렬
		Integer[] sorted = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(sorted, Collections.reverseOrder());

		// m개씩 상자 구성
		for (int i = m - 1; i < sorted.length; i += m) {
			answer += sorted[i] * m; // 상자당 이익 = 최소 점수 * m
		}
		System.out.println(answer);
	}

	// 오름 차순 방법
	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		// 1. score를 정렬 (높은 점수부터 팔다)
		Arrays.sort(score);
		// 2. m개씩 묶어 상자 구성 (가장 낮은 점수 * m이 그 상자의 이익)
		for(int i = score.length; i >= m; i -=m){
			answer += score[i - m] * m;
		}
		// 3. 이익 합산하여 answer 반환
		return answer;
	}
}
