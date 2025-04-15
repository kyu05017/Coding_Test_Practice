package 단계별풀이._25년_04월.복습및풀이_250413;
import java.util.*;

public class _003_DFS_예시_연습 {
	static void bfs(int v, boolean[] visited, List<List<Integer>> graph) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(v);
		visited[v] = true;

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			System.out.print(curr + " ");
			for (int next : graph.get(curr)) {
				if (!visited[next]) {
					visited[next] = true;
					queue.offer(next);
				}
			}
		}
	}

	public static void main(String[] args) {
		int n = 5; // 정점 개수
		int[][] edges = {{1, 2}, {1, 3}, {2, 4}, {3, 5}};

		// 리스트 미리선언
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

		// 갈 수 있는 곳 정의
		for (int[] edge : edges) {
			graph.get(edge[0]).add(edge[1]);
			graph.get(edge[1]).add(edge[0]); // 무방향 그래프
		}
		/**
		 * graph.get(0) -> []
		 * graph.get(1) -> [2, 3]
		 * graph.get(2) -> [1, 4]
		 * graph.get(3) -> [1, 5]
		 * graph.get(4) -> [2]
		 * graph.get(5) -> [3]
		 *
		 * 각 노드가 갈 수 있는 곳들만 정리해서 넣어둔다.
		 * 0번 노드는 없다
		 * 1번 노드는 2번, 3번 노드로만 갈 수 있다.
		 * 2번 노드는 1번, 4번 노드로만 갈 수 있다.
		 * 3번 노드는 1번, 5번 노드로만 갈 수 있다.
		 * 4번 노드는 2번 노드만 갈 수 있다.
		 * 5번 노드는 3번 노드만 갈 수 있다.
		 */

		// 정점 방문 순서 보장을 위해 정렬
		for (List<Integer> list : graph) Collections.sort(list);

		// new boolean[n + 1] 가 있는 이유는
		// 이미 방문한 노드를 다시 방문하지 않도록 막기 위해
		System.out.println("DFS 방문 순서: ");
		System.out.println("-----------------------------------");
		dfs(1, new boolean[n + 1], graph);
		System.out.println();

		System.out.print("BFS 방문 순서: ");
		//bfs(1, new boolean[n + 1], graph);
	}
	// DFS 재귀 ( 깊이 우선 -> 백트랙킹 ) 구조
	static void dfs(int v, boolean[] visited, List<List<Integer>> graph) {
		System.out.println("방문 위치 : "+v + " ");
		System.out.println("방문 여부 : "+((visited[v])?"방문":"미방문"));
		System.out.println("가는 방향 : "+graph.get(v).toString());

		visited[v] = true;

		for (int next : graph.get(v)) {
			System.out.println("    다음 방향 : "+next);
			System.out.println("    방문 여부 : "+((visited[next])?"방문":"미방문"));
			System.out.println("-----------------------------------");
			if (!visited[next]) dfs(next, visited, graph);
		}
		System.out.println("돌아 오기 : "+v);
		System.out.println("-----------------------------------");
	}
}
