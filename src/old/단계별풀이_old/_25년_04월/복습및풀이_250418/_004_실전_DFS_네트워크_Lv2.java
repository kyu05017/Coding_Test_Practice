package old.단계별풀이_old._25년_04월.복습및풀이_250418;

public class _004_실전_DFS_네트워크_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution(3, new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
	}
	public static int solution(int n, int[][] computers) {
		int answer = 0;

		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			System.out.println("    main i : "+i);
			System.out.println("    방문 여부 : "+visited[i]);
			if (!visited[i]) {
				System.out.println("*** main 재귀 시작 ***");
				dfs(i, visited, computers);
				answer++;
			}
		}

		return answer;
	}

	private static void dfs(int current, boolean[] visited, int[][] computers){
		// 방문 완료
		visited[current] = true;
		System.out.println("        visited["+current+"] : "+visited[current]);

		for(int i = 0; i < computers.length; i++){
			System.out.println("            computer i : " + i);
			System.out.println("            computers["+current+"]["+i+"]  : " + computers[current][i]);
			System.out.println("            visited["+i+"]  : " + visited[i]);
			if(computers[current][i] == 1 && !visited[i]){
				System.out.println("                *** computer 재귀 시작 ***");
				dfs(i,visited,computers);
			}
			System.out.println();
		}
		System.out.println("재귀 종료 : "+current+"\n");
	}
}
