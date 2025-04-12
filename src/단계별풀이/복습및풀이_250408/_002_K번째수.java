package 단계별풀이.복습및풀이_250408;

import java.util.*;

public class _002_K번째수 {
	public static void main(String[] args) {

	}
	/**
	 * 풀이시간 : 10분
	 *
	 * 초반에 헤맨점
	 * 1. 두번째 반복문에서 지정된 크기 tmp[0]-1 ~ tmp[1]
	 * 까지 탐색하면서 실제 array의 크기를 고려하지 않고 숫자를 찾으려고 함
	 *
	 * 해결 : list에 저장 후 찾기
	 *
	 * 2. 문제를 끝까지 읽지 않음, 풀이 했던 문제라 기억을 더듬어 풀고 있었기에
	 * list에 저장 후 정렬한다는 문제를 해결하지 않아 오답을 출력
	 *
	 * 해결 Collections.sort로 오름차순 정렬 후 정답을 도출
	 * */
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for(int i = 0; i < commands.length; i++){

			int[] tmp = commands[i];
			List<Integer> temp = new ArrayList<>();

			for(int j = tmp[0]-1; j < tmp[1]; j++){
				temp.add(array[j]);
			}
			Collections.sort(temp);
			answer[i] = temp.get(tmp[2]-1);
		}
		return answer;
	}


	///  리팩토리 코드
	public int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(tmp);
			answer[i] = tmp[commands[i][2]-1];
		}
		return answer;
	}
}
