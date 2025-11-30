package 단계별풀이_old._25년_04월.복습및풀이_250412;

import java.util.Arrays;

public class _001_K번째_수_정렬기초_슬라이딩 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}})));
	}

	// 스트림 복습
	private static int[] solution(int[] array, int[][] commands){
		return Arrays.stream(commands).mapToInt( c -> {
			int[] sliced = Arrays.copyOfRange(array,c[0]-1,c[1]);
			Arrays.sort(sliced);
			return sliced[c[2]-1];
		}).toArray();
	}

	// 기본형 복습
	private static int[] solution2(int[] array, int[][] commands){

		int[] answer = new int[commands.length];
		int i = 0;
		for(int[] c : commands){

			int[] tmp = Arrays.copyOfRange(array,c[0]-1,c[1]);
			Arrays.sort(tmp);

			answer[i] = tmp[c[2]-1];
			i++;
		}
		return answer;
	}
}
