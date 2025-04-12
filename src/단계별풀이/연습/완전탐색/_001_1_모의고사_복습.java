package 단계별풀이.연습.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _001_1_모의고사_복습 {

	public static void main(String[] args){
		System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
	}

	/**
	 문제 이해	💯 완벽
	 반복 로직	💯 자연스럽게 구현
	 디버깅 감각	💯 시각적으로 비교한 점 최고
	 코드 완성도	✅ 실전에서도 잘 통할 수준!
	 */

	public static int[] solution(int[] answers) {
		int[] answer = {};

		int[][] number = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};

		List<Integer> list = new ArrayList<>();
		List<Integer> answer_list = new ArrayList<>();
		int max = -1;
		int score = 0;
		int size = 0;
		// 문제의 패턴을 돈다
		for(int i = 0; i < number.length; i++){

			// 문제를 순회
			for(int j = 0; j < answers.length; j++) {

				int idx = j % number[i].length;

				System.out.print("idx : "+ number[i][idx] + " answers : " + answers[j]);
				if(number[i][idx] == answers[j]){
					score ++;
				}
				System.out.println();
			}
			System.out.println();

			if(score > max){
				max = score;
			}
			list.add(score);
			score = 0;
		}
		System.out.println("max : "+ max);

		for(int i = 0; i < list.size();i++){
			if(list.get(i) == max){
				answer_list.add(i);
			}
		}

		answer = new int[answer_list.size()];

		for(int i = 0; i < answer_list.size();i++){
			answer[i] = answer_list.get(i)+1;
		}

		return answer_list.stream().mapToInt(Integer::intValue).toArray();
	}
}
