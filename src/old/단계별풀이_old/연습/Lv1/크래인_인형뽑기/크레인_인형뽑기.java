package old.단계별풀이_old.연습.Lv1.크래인_인형뽑기;

import java.util.Stack;

public class 크레인_인형뽑기 {

	public static void main(String[] args) {
		System.out.println(sol(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},new int[]{1,5,3,5,1,2,1,4}));
	}

	private static int sol(int[][] board, int[] moves){
		int answer = 0;
		Stack<Integer> basket = new Stack<>();

		for (int move : moves) {
			int col = move - 1; // 인덱스는 0부터 시작하므로 -1

			for (int row = 0; row < board.length; row++) {
				if (board[row][col] != 0) {
					int picked = board[row][col];
					board[row][col] = 0;

					if (!basket.isEmpty() && basket.peek() == picked) {
						basket.pop();
						answer += 2;
					} else {
						basket.push(picked);
					}

					break; // 한 번 뽑으면 해당 move는 종료
				}
			}
		}

		return answer;
	}
}
