package 단계별풀이._25년_04월.복습및풀이_250418;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _001_복습_프로세스_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1},0));
	}
	private static int solution(int[] priorities, int location){
		// 몇 번째 실행 되는지?
		int answer = 0;

		Queue<int[]> queue = new LinkedList<>();

		for(int i = 0; i < priorities.length; i++){
			int[] temp = new int[2];

			temp[0] = i;
			temp[1] = priorities[i];

			queue.offer(temp);
		}

		int max = Arrays.stream(priorities).max().getAsInt();

		System.out.println(max);

		while(!queue.isEmpty()){

			int[] temp = queue.poll();

			if(temp[1] < max) {
				queue.offer(temp);
			} else {

				// 실행
				answer++;

				if(location == temp[0]){
					return answer;
				}
				// 실행 값 초기화
				priorities[temp[0]] = -1;

				//최고 값 갱신
				max = Arrays.stream(priorities).max().getAsInt();
			}

		}
		return answer;
	}
}
