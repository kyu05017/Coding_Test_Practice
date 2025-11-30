package 단계별풀이_old._25년_04월.복습및풀이_250421;


import java.util.Arrays;

public class _001_연습_캐릭터의좌표 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"right", "right", "right", "right", "right", "left"},new int[]{9, 5})));
	}
	public static int[] solution(String[] keyinput, int[] board) {
		int[] answer = {0,0};

		int maxV = board[1]/2;
		int maxH = board[0]/2;

		for (String s : keyinput) {
			if (s.equals("up")) {
				if(answer[1] > maxV){
					answer[1] =  maxV;
				} else {
					answer[1] += 1;
				}
			} else if (s.equals("down")) {
				int temp = (maxV*-1);
				if(answer[1] <= temp){
					answer[1] = temp;
				} else {
					answer[1] -= 1;
				}
			} else if (s.equals("right")) {
				if(answer[0] >= maxH){
					answer[0] = maxH;
				} else {
					answer[0] += 1;
				}
			} else {
				int temp = (maxH*-1);
				if(answer[0] <= temp){
					answer[0] = temp;
				} else {
					answer[0] -= 1;
				}
			}
		}
		return answer;
	}
}
