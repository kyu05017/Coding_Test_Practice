package 단계별풀이_old._25년_04월.복습및풀이_250426;

import java.util.Arrays;
import java.util.Stack;

/**
 * 문제 요약 ✨
 * board라는 2차원 배열이 있어.
 * (위에서 인형을 뽑아 내려오는 구조야)
 *
 * moves 배열이 있어.
 * (몇 번째 열에서 인형을 뽑을지 지시하는 배열이야)
 *
 * 규칙
 *
 * moves에서 한 칸씩 읽어와서
 *
 * board의 해당 열에서 가장 위에 있는 인형을 꺼내.
 *
 * 꺼낸 인형을 stack에 쌓아.
 *
 * 같은 인형이 연속으로 2개 쌓이면 터져서 둘 다 사라짐!
 *
 * 터진 인형 2개당 점수 +2
 */
public class _004_복습_크레인_인형뽑기_게임_Lv1 {
	public static void main(String[] args) {
		System.out.println("풀이 : "+solution(
				new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},
				new int[]{1,5,3,5,1,2,1,4}
		));
	}
	///  내풀이
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> box = new Stack<>();

		// 무빙
		for(int m : moves){
			int dir = (m-1);
			// 보드크기
			for(int[] b : board){
				if(b[dir] != 0){
					if((!box.isEmpty()) && (box.peek() == b[dir])){
						box.pop();
						answer += 2;
					} else {
						box.push(b[dir]);
					}
					b[dir] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
