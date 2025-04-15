package 단계별풀이._25년_04월.복습및풀이_250411;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _003_모의고사 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
	}

	private static int[] solution(int[] answers){

		int[][] pattern = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
		int[] answer = {};
		List<Integer> list = new ArrayList<>();

		int max = 0;
		for (int[] p : pattern) {
			int score = 0;
			int[] tmp = p;

			for (int i = 0; i < answers.length; i++) {
				int idx = i % tmp.length;
				if (answers[i] == tmp[idx]) {
					score++;
				}
			}

			list.add(score);
			if (max < score) {
				max = score;
			}
		}

		for(int i = 0; i < list.size(); i++){
			if(list.get(i) != max){
				list.remove(i);
			}
		}

		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++){
			answer[i] = i+1;
		}
		return answer;
	}

	private static int[] solution2(int[] answers){
		int[][] patterns = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
		int[] scores = new int[3];

		for(int i = 0; i < answers.length; i++){
			for(int j = 0; j < 3; j++){
				if(answers[i] == patterns[j][i % patterns[j].length]){
					scores[j]++;
				}
			}
		}
		int max = Arrays.stream(scores).max().getAsInt();

		return IntStream.range(0,3)
				.filter(i -> scores[i] == max)
				.map( i -> i+1)
				.toArray();
	}
}
