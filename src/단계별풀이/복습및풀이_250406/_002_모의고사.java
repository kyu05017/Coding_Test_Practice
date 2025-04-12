package 단계별풀이.복습및풀이_250406;

import java.util.ArrayList;
import java.util.List;

public class _002_모의고사 {
	public static void main(String[] args) {

	}
	public int[] solution(int[] answers) {
		int[] answer = {};

		int[][] pattern = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};

		List<Integer> list = new ArrayList<>();
		List<Integer> return_list = new ArrayList<>();

		int maxScore = -1;

		for(int i = 0; i < pattern.length; i++){
			int score = 0;

			for(int j = 0; j < answers.length; j++){
				int idx = j % pattern[i].length;
				if(answers[j] == pattern[i][idx]){
					score++;
				}
			}
			if(score > maxScore){
				maxScore = score;
			}
			list.add(score);
		}

		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == maxScore){
				return_list.add(i);
			}
		}
		answer = new int[return_list.size()];
		for(int i = 0; i < return_list.size(); i++){
			answer[i] = return_list.get(i)+1;
		}

		return answer;
	}
}
