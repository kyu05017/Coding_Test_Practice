package 단계별풀이_old._25년_04월.복습및풀이_250414;

import java.util.Arrays;

public class _001_복습_K번째수 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for(int i = 0; i < commands.length; i++){
			int[] tempArr = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);

			Arrays.sort(tempArr);
			answer[i] = tempArr[commands[i][2]-1];
		}

		return answer;
	}
}
