package old.단계별풀이_old._25년_04월.복습및풀이_250412;

import java.util.*;

public class _005_기능개발_Lv2_스택응용 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80}, new int[]{1, 1, 1, 1, 1})));
	}

	/// list 버전 풀이
	private static int[] solution(int[] progresses, int[] speeds){
		/**
		 * 핵심 개념
		 * 1.각 작업은 진행도(progresses[i]) + 매일 개발속도(speed[i]) 로 완성됨
		 * 2.앞의 작업이 끝나야만 뒷 작업이 배포 가능함 (배포 순서 = 작업 순서)
		 * 3.하루에 여러 작업이 동시에 배포될 수 있음, 단 배포 순서를 지켜야 함
		 */
		List<Integer> list = new ArrayList<>();
		int day = (int)Math.ceil((double)(100-progresses[0])/speeds[0]);
		int cnt = 1;// 배포될 량
		for(int i = 1; i < progresses.length; i++){
			int currentDay = (int)Math.ceil((double)(100-progresses[i])/speeds[i]);

			// 다음 작업일수가 day보다 작거나 같다면 ( 이하를 쓰는 이유는 앞에 day가 우선순위가 높기에 )
			if(currentDay <= day){
				cnt++;
			}
			// 더 오래 걸리는 작업 일수가 들어온다면
			else{
				// 기존 작업 저장
				list.add(cnt);

				// 날짜를 이동 시켜준다.
				day = currentDay;

				// 배포된량 초기화
				cnt =1;
			}
		}
		// 마지막 배포 처리 => 마지막 인덱스가 더 커진다면, 저장이 안됨
		list.add(cnt);

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	// 내풀이  => 오답
	/**
	 * 오답의 이유
	 * 1. 전반적인 알고리즘은 이해했으나, 배포 규칙을 잘못 적용
	 *
	 * 중대한 실수
	 * 1.stack.peek() >= tmp 에서 바로 workDone++ 하고 returnList.add(workDone)을
	 * 해버리면 다음 작업이 배포 가능한지 체크하지 않고 추가되므로 배포 규칙을 무시하게 된다
	 */
	private static int[] solution1(int[] progresses, int[] speed){
		int[] answer = {};

		// 문제요약
		// 1. progresses 는 각 우선순위가 높은 순서대로, 진행도가 담겨 있다.
		// 2. speed 는 각 인덱스의 개발 속도가 적용되어 있다.
		// 3. return 되는 배열 인덱스 하나당 하루라고 치고, 하루에 배포되는 갯수를 반환

		List<Integer> list = new LinkedList<>();
		List<Integer> returnList = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		int max = -1;
		// 입출력 예
		// 0번 인덱스
		//      진행도 : 93, 개발속도 : 1 => ( 100 - 93 = 7 )  => Math.ceil((double)7/1))   =>소요시간 7일
		// 1번 인덱스
		//      진행도 : 30, 개발속도 : 30=> ( 100 - 30 = 70)  => Math.ceil((double)70/30)) =>소요시간 3일
		// 2번 인덱스
		//      진행도 : 55, 개발속도 : 5 => ( 100 - 55 = 45 ) => Math.ceil((double)70/30)) =>소요시간 9일
		for(int i = 0; i < speed.length; i++){
			int deadDay = 100 - progresses[i];
			int time = (int)Math.ceil((double)deadDay/speed[i]);
			//System.out.println("남은 작업량 : " + deadDay+" || 소요시간 : "+time+"일");
			list.add(time);

			// 최대 소요일 구하기
			if(max < time){
				max = time;
			}
		}
		//System.out.println(list.toString());

		int workDone = 0;
		// 배포
		for(int i = 0; i < list.size(); i++){

			// 작업 날짜 가져오기
			int tmp = list.get(i);

			// 스택이 비어있다면
			if(stack.isEmpty()){

				// 작업 날짜 저장
				stack.push(tmp);
				workDone++;
			}
			// 아니라면
			else {
				// tmp 가 저장된 작업일수보다 작거나 같으면 ( 우선순위는 앞쪽 인덱스가 우위 )
				if(stack.peek() >= tmp){
					workDone++;
					returnList.add(workDone);
					workDone = 0;
					continue;
				}
				// tmp가 더 크다면 새로 저장
				else if(stack.peek() < tmp){
					workDone++;
					returnList.add(workDone);
					continue;
				}
			}
		}
		return returnList.stream().mapToInt(Integer::intValue).toArray();
	}
}
