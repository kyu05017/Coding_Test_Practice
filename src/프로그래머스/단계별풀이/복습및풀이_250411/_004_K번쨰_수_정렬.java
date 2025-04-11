package 프로그래머스.단계별풀이.복습및풀이_250411;

import java.util.Arrays;

public class _004_K번쨰_수_정렬 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}})));
	}
	private static int[] solution(int[] array, int[][] commands){
		int[] answer = new int[commands.length];
		for(int i = 0; i < answer.length;i++){
			int[] c = commands[i];
			int[] tmp = Arrays.copyOfRange(array,c[0]-1,c[1]);
			Arrays.sort(tmp);
			answer[i] = tmp[c[2]-1];
		}
		return answer;
	}
	private static int[] solution2(int[] array, int[][] commands){
		return Arrays.stream(commands)
				.mapToInt( c -> {
					int[] sliced = Arrays.copyOfRange(array,c[0]-1, c[1]);
					Arrays.sort(sliced);
					return sliced[c[2]-1];
				}).toArray();
	}
}
