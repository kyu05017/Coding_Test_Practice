package 단계별풀이._25년_04월.복습및풀이_250412;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _006_프로세스_구_프린터_Lv2_우선순위_큐 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1},0));
	}
	private static int solution(int[] priorities, int location) {

		Queue<int[]> queue = new LinkedList<>();

		// 배열 자체를 제네릭으로 만들어 인덱스와 우선순위를 담는다.
		for(int i = 0; i < priorities.length; i++){
			queue.offer(new int[]{i,priorities[i]});
		}

		int answer = 0;

		while(!queue.isEmpty()){
			// 가장 맨 앞을 꺼낸다.
			int[] current = queue.poll();

			// 큰 수인지 여부
			boolean isHigher = false;

			// 남은 큐를 돌면서, 하나라도 크다면, 종료
			for(int[] q : queue){
				if(q[1] > current[1]){
					isHigher = true;
					break;
				}
			}

			// 더 큰 우선 순위가 존재한다면?
			if(isHigher) {
				// 다시 맨뒤로 삽입
				queue.offer(current);
			}
			// 자기가 가장 크다면
			else {
				// 실행
				answer++;

				//실행된 프로세스의 인덱스가 로케이션과 같다면 반환
				if(current[0] == location){
					return answer;
				}
			}
		}
		return answer;
	}
	/// 내풀이
	private static int solution2(int[] priorities, int location){
		/**
		 * 문제 이해
		 * 1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
		 * 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
		 * 3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
		 *   3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
		 */
		int answer = 0;

		// 큐에 선언과 삽입
		Queue<Task> q = new LinkedList<>();
		for(int i = 0; i < priorities.length; i++){
			q.offer(new Task(i,priorities[i]));
		}

		// 가장큰 값
		int max = Arrays.stream(priorities).max().getAsInt();
		System.out.println("max : "+ max);

		/**
		 * 원본 priorities [ 2, 1, (3), 2 ]
		 * 0회차 => 2 => 가장 우선 순위가 높은 3이 존재 => [ 1, (3), 2, 2 ]
		 * 1회차 => 1 => 가장 우선 순위가 높은 3이 존재 => [ (3), 2, 2, 1 ]
		 * 2회차 => 3 => 로케이션의 숫자 3과 동일 실행 => [ 2, 2, 1] => 실행된 번호 1번
		 */
		boolean isProcessing = true;
		int taskNumber = 0;

		while(isProcessing) {
			// 1. 하나를 꺼낸다.
			Task task = q.poll();

			// 우선순위가 가장 높은 프로세스 보다 작으면 다시 추가 아니라면 없다면 실행
			if(max > task.task){
				q.offer(task);
			} else {
				// 실행
				taskNumber++;

				// 실행된 task의 idx가 location과 같다면, 실행된 숫서의 값을 반환한다.
				if(task.idx == location){
					answer = taskNumber;
					isProcessing = false;
				}
				// 최고의 우선순위 값 갱신
				priorities[task.idx] = -1;
				max = Arrays.stream(priorities).max().getAsInt();
			}
		}
		return answer;
	}

	private static class Task {
		int idx;
		int task;

		public Task(int idx, int task) {
			this.idx = idx;
			this.task = task;
		}
	}
}
