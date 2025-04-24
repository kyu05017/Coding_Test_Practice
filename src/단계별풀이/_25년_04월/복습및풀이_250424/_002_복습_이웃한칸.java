package 단계별풀이._25년_04월.복습및풀이_250424;

public class _002_복습_이웃한칸 {
	public static void main(String[] args) {
		solution(new String[][]{{"blue", "red", "orange", "red"},{"red", "red", "blue", "orange"},{"blue", "orange", "red", "red"},{"orange", "orange", "red", "blue"}},1,1);
	}
	public static int solution(String[][] board, int h, int w) {
		int answer = 0;

		int n = board.length;
		int cnt = 0;

		int[] dh = {0,1,-1,0};
		int[] dw = {1,0,0,-1};

		for(int i = 0; i < 4; i++){
			int h_check = h + dh[i];
			int w_check = w + dw[i];

			if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n){
				if(board[h][w].equals(board[h_check][w_check])){
					cnt++;
				}
			}

		}

		return cnt;
	}
}
