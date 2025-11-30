package old.단계별풀이_old._25년_04월.복습및풀이_250426;

public class _005_심화_프렌즈4블록_Lv2_재도전 {
	public static void main(String[] args) {
		System.out.println("풀이 : "+solution(6,6,new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}));
	}
	static int solution(int m, int n, String[] board){
		int answer = 0;

		// 1. 스트링을 char 2차원 배열로 변경
		char[][] map = new char[m][n];
		for(int i = 0; i < m; i++){
			map[i] = board[i].toCharArray();
		}

		while(true){
			// 2. 터트릴 블록 표시할 boolean 배열
			boolean[][] check = new boolean[m][n];

			// 3. 2x2 같은 블록 찾기
			for(int i = 0; i < m-1; i++){
				for(int j = 0; j < n-1; j++) {
					// 3-1. 대상 문자
					char current = map[i][j];

					// 3-2. 빈칸이면 패스
					if (current == '0') continue;

					// 3-2. 2x2가 같다면 터트릴 블록에 추가
					if (
							current == map[i][j + 1] &&   // 우측 칸
									current == map[i + 1][j] &&   // 아랫 칸
									current == map[i + 1][j + 1]    // 대각선 칸
					) {
						check[i][j] = true;
						check[i][j + 1] = true;
						check[i + 1][j] = true;
						check[i + 1][j + 1] = true;
					}
				}
				// for End
			}
			// for End

			// 4. 지울 게 하나라도 없으면 break;
			boolean found = false;
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					if(check[i][j]){
						found = true;
						answer++;
						map[i][j] = '0';
					}
				}
			}
			// for Enb
			if(!found)break;

			// 5. 블록 떨어뜨리기 (배열 우측으로 90도 회전)
			for(int j = 0; j < n; j++){

				for(int i = m-1; i >= 0; i--){
					System.out.print(map[i][j] + " ");
					// 빈칸을 찾으면
					if(map[i][j] == '0'){
						for(int k = i -1; k >= 0; k--){
							//System.out.println("\n i : "+i+", j : "+j+", k : "+k);
							// 버블 정렬 형식
							if (map[k][j] != '0') {
								//System.out.println("map[i][j] : "+map[i][j]+", map[k][j] : "+map[k][j]);
								map[i][j] = map[k][j];
								map[k][j] = '0';
								break;
							}
						}
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		// while End

		return answer;
	}
}
