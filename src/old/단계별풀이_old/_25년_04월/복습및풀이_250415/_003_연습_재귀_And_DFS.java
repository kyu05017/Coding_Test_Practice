package old.단계별풀이_old._25년_04월.복습및풀이_250415;

import java.util.*;

public class _003_연습_재귀_And_DFS {
	public static void main(String[] args) {
		List<List<Integer>> graph = new ArrayList<>();
		int n = 6;
		// 각 노드들 만큼의 인덱스 저장을 위해!
		// 0 ~ 6까지
		// 0 미사용
		// 1 ~ 5 사용
		for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

		// 무방향 그래프
		int[][] edges = {
				{1, 2}, {1, 3},
				{2, 4}, {3, 5}
		};
		for (int[] edge : edges) {
			graph.get(edge[0]).add(edge[1]);
			graph.get(edge[1]).add(edge[0]);
		}
		// 0 번이 갈 수 있는 노드는 없다
		// 1번 -> 2,3
		// 2번 => 1,4
		// 3번 => 1,5
		// 4번 => 2
		// 5번 => 3

		// visited 배열을 n + 1 크기로 만드는 이유?
		//visited[0]은 사용하지 않고,
		//1~5번 노드에 대해 방문 여부를 기록하려고 n + 1 크기를 만든다
		boolean[] visited = new boolean[n + 1];
		System.out.print("DFS 방문 순서: ");
		dfs(1, visited, graph);
	}
	static void dfs(int v, boolean[] visited, List<List<Integer>> graph) {
		System.out.println("진입: " + v);
		visited[v] = true;

		for (int next : graph.get(v)) {
			if (!visited[next]) {
				System.out.println("    " + v + " → " + next + " 이동");
				dfs(next, visited, graph);
			}
		}

		System.out.println("종료: " + v + " (모든 인접 노드 탐색 완료)");
	}
}
