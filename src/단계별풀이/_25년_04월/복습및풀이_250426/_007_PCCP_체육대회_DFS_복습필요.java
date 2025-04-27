package 단계별풀이._25년_04월.복습및풀이_250426;

import java.util.*;

public class _007_PCCP_체육대회_DFS_복습필요 {
	public static void main(String[] args) {
		System.out.println(solution(new int[][]{{40, 10, 10},{20, 5, 0},{30, 30, 30},{70, 0, 70},{100, 100, 100}}));
	}
	/**
	 * 당신이 다니는 학교는 매년 체육대회를 합니다.
	 * 체육대회는 여러 종목에 대해 각 반의 해당 종목 대표가 1명씩 나와 대결을 하며,
	 * 한 학생은 최대 한개의 종목 대표만 할 수 있습니다.
	 * 당신의 반에서도 한 종목당 1명의 대표를 뽑으려고 합니다.
	 * 학생들마다 각 종목에 대한 능력이 다르지만 이 능력은 수치화되어 있어 미리 알 수 있습니다.
	 * 당신의 반의 전략은 각 종목 대표의 해당 종목에 대한 능력치의 합을 최대화하는 것입니다.
	 * 다음은 당신의 반 학생이 5명이고, 종목의 개수가 3개이며, 각 종목에 대한 학생들의 능력치가 아래 표와 같을 때, 각 종목의 대표를 뽑는 예시입니다.
	 */
	/// 그리디 + 정렬 => 실패 ( 이유 모름 )
	private static int solution(int[][] ability){
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < ability.length; i++){
			Set<String> set = new HashSet<>();
			int now_score = ability[i][0];
			set.add(String.valueOf(i));

			for(int k = 1; k < ability[0].length; k++) {
				int score = -1;
				int best_student = -1;

				for (int student = 0; student < ability.length; student++) {
					if (!set.contains(String.valueOf(student))) {
						int st_score = ability[student][k];
						if (score < st_score) {
							score = st_score;
							best_student = student;
						}
					}
				}
				if (best_student != -1) {
					set.add(String.valueOf(best_student));
					now_score += score;
				}
			}
			list.add(now_score);
		}
		return list.stream().mapToInt(e->e).max().orElse(0);
	}

	private static int maxScore = 0;
	private static boolean[] visited;

	public static int solution1(int[][] ability){
		int studentCount = ability.length;
		int eventCount = ability[0].length;

		visited = new boolean[studentCount];

		dfs(0,0,ability,eventCount);

		return maxScore;
	}
	static void dfs(int eventIdx, int currentSum, int[][] ability, int totalEvent){
		if(eventIdx == totalEvent){
			maxScore = Math.max(maxScore,currentSum);
			return;
		}

		for(int student = 0; student < ability.length; student++){

			if(!visited[student]){
				visited[student] = true;
				dfs(eventIdx+1,currentSum+ability[student][eventIdx],ability,totalEvent);
				visited[student] = false;
			}
		}
	}
}
