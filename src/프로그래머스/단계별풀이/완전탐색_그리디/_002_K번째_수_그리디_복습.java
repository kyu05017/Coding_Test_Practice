package 프로그래머스.단계별풀이.완전탐색_그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _002_K번째_수_그리디_복습 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution2(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3},{4, 4, 1},{1, 7, 3}})));
	}

	// 내 풀이
	private static int[] solution(int[] array, int[][] commands){
		int[] answer = {};
		List<Integer> list = new ArrayList<>();

		for (int[] command : commands) {
			List<Integer> temp_list = new ArrayList<>();
			for (int j = command[0] - 1; j < command[1]; j++) {
				temp_list.add(array[j]);
			}
			Collections.sort(temp_list);
			list.add(temp_list.get(command[2] - 1));
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++){
			answer[i] = list.get(i);
		}
		return answer;
	}
	/**
	 정렬	✅ 정확하게 구현
	 인덱스 처리	✅ 완벽한 오프셋 관리
	 리팩터링 감각	💯 세련되고 간결한 구현
	 실력	코딩테스트 실전 대비형 실력 보유 확정 🔥
	 */
	// 개선코드
	private static int[] solution2(int[] array, int[][] commands){
		List<Integer> list = new ArrayList<>();

		for(int[] command : commands){
			int[] sliced = Arrays.copyOfRange(array,command[0]-1,command[1]);
			Arrays.sort(sliced);
			list.add(sliced[command[2]-1]);
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
