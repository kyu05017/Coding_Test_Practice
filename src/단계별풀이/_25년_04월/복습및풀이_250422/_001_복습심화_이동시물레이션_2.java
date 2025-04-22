package 단계별풀이._25년_04월.복습및풀이_250422;

import java.util.Arrays;

@SuppressWarnings("all")
public class _001_복습심화_이동시물레이션_2 {
	public static void main(String[] args) {
		String[] keyinput = {"up", "up", "left", "down", "left"};
		int[] board = {5,5};
		int[][] obstacles = {{-1,1},{-2,0}};
		int[] now = {0,0};

		for(int i = 0; i < keyinput.length; i++) {
			int move = 0;
			String movement = keyinput[i];
			boolean isUpDownYn = (movement.equals("up") || movement.equals("down"));
			int max = (isUpDownYn)?board[1]/2 : board[0]/2;

			// 업 또는 라이트
			if(movement.equals("up") || movement.equals("right")){
				move = 1;
			}
			// 다운 또는 레프트
			else if(movement.equals("down") || movement.equals("left")){
				move = -1;
			}
			int direction = (isUpDownYn) ? 1 : 0;

			int[] tempNow = new int[2];
			tempNow[0] = now[0];
			tempNow[1] = now[1];

			tempNow[direction] += move;
			boolean isBlocked = false;

			// 장애물 검사
			for(int[] b : obstacles){
				if(b[0] == tempNow[0] && b[1] == tempNow[1]){
					isBlocked = true;
					break;
				}
			}

			// 범위를 초과하는 경우
			if(movement.equals("up") || movement.equals("right")){
				if(tempNow[direction] >= max){
					tempNow[direction] = max;
				}
			} else if(movement.equals("down") || movement.equals("left")){
				int tempMax = max*-1;
				if(tempNow[direction] <= tempMax){
					tempNow[direction] = tempMax;
				}
			}

			if(!isBlocked){
				now = tempNow;
			}
		}
		System.out.println(Arrays.toString(now));
	}
}
