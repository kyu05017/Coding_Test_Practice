package 단계별풀이_old._25년_04월.복습및풀이_250415;

import java.util.ArrayList;
import java.util.List;

public class _004_연습_재귀_And_DFS {
	public static void main(String[] args) {
		// 노드의 갯수 ( 1 ~ 5 )
		int n = 6;
		List<List<Integer>> list = new ArrayList<>();

		// 그래프 초기화 (인덱스 0은 더미)
		for(int i = 0; i <= n; i++){
			list.add(new ArrayList<>());
		}

		// 엣지 정보 (무방향)
		int[][] edges = {
				{1, 2},
				{1, 3},
				{2, 4},
				{3, 5}
		};

		// 그래프 구성
		for(int[] edge : edges){
			list.get(edge[0]).add(edge[1]);
			list.get(edge[1]).add(edge[0]);
		}

		// 방문 배열
		boolean[] visited = new boolean[n+1];

		System.out.println("=== 탐색 시작 ===");
		dfs(1, visited,list);
	}

	static void dfs(int v, boolean[] visited, List<List<Integer>> list){
		System.out.println("진입 노드 : "+v);
		System.out.println("방문 여부 : "+visited[v]);

		visited[v] = true;

		for(int next : list.get(v)){
			// 미방문일 경우
			if (!visited[next]) {
				System.out.println("    → " + v + "에서 " + next + "로 이동");
				dfs(next, visited, list);
				System.out.println("    ← " + next + "에서 " + v + "로 돌아옴");
			} else {
				System.out.println("    - " + next + "는 이미 방문했음");
			}
		}
		System.out.println("[종료] 노드: " + v);
	}
}

