package 단계별풀이.복습및풀이_250414;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _003_연습_재귀_DFS {

	// 노드를 그래프화 하기 위한 리스트
	private static List<List<Integer>> graph = new ArrayList<>();

	// 방문 여부체크
	private static boolean[] visited;

	public static void main(String[] args) {
		// 노드의 갯수
		int n = 6;

		// 연결
		int[][] edges = {
				{1, 2},
				{2, 5},
				{5, 1},
				{3, 4}
		};

		// 그래프 생성
		for(int i = 0; i <= n; i++)graph.add(new ArrayList<>());

		// 연결 가능한 부분 끼리 리스트화
		for(int[] edge : edges){
			graph.get(edge[0]).add(edge[1]);
			graph.get(edge[1]).add(edge[0]);

			/**
			 * 0번 노드는 갈 수 있는 곳이 없다.
			 * 1번이 갈 수 있는 곳은 2 , 5
			 * 2번이 갈 수 있는 곳은 1 , 5
			 * 3번이 갈 수 있는 곳은 4
			 * 4번이 갈 수 있는 곳은 3
			 * 5번이 갈 수 있느 곳은 2 ,1
			 * */
		}

		// 방문 가능 여부를 노드에 맞춤
		visited = new boolean[n+1];
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(i);
				cnt++;
			}
		}

		System.out.println("연결 요소 개수: " + cnt);
	}

	static void dfs(int node) {
		visited[node] = true;
		for (int next : graph.get(node)) {
			if (!visited[next]) dfs(next);
		}
	}
}
