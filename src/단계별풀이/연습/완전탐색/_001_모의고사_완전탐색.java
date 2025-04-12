package 단계별풀이.연습.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _001_모의고사_완전탐색 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{9,9,9,9,9,9,9})));
	}

	private static int[] solution(int[] answers) {
		int[] answer = {};

		String[] patterns = {"12345","21232425","3311224455"};

		List<Integer> list = new ArrayList<>();
		List<Integer> answer_list = new ArrayList<>();

		int max = -1;
		for(int i = 0; i < 3; i++){

			String[] pattern = patterns[i].split("");
			int cnt = 0;
			int score = 0;

			for(int j = 0; j<answers.length ;j++){
				// "패턴 순환: index = i % pattern.length"
				int idx = j % pattern.length; // 반복 트릭 기억***
				if (Integer.parseInt(pattern[idx]) == answers[j]) {
					score++;
				}
			}
			if(score > max){
				max = score;
			}
			list.add(score);
		}

		for(int i = 0; i < list.size(); i++){
			if(list.get(i) == max){
				answer_list.add(i);
			}
		}

		answer = new int[answer_list.size()];

		for(int i = 0; i < answer_list.size();i++){
			answer[i] = answer_list.get(i)+1;
		}

		return answer;
	}


}

