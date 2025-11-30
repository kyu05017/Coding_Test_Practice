package old.단계별풀이_old._25년_05월.복습및풀이_250503;

import java.util.Arrays;

public class _01_복습_K_번째_수 {
	public static void main(String[] args) {
		int[] result = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3},{4, 4, 1},{1, 7, 3}});
		System.out.println(Arrays.toString(result));
	}
	private static int[] solution(int[] array, int[][] commands){
		int[] answer = new int[commands.length];

		for(int i = 0; i < commands.length; i++){
			int[] tempArr = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
			Arrays.sort(tempArr);
			answer[i] = tempArr[commands[i][2]-1];
		}
		return answer;
	}
}
