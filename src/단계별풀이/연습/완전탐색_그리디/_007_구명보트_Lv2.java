package 단계별풀이.연습.완전탐색_그리디;

import java.util.Arrays;

public class _007_구명보트_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{70, 80, 50}, 100));
	}

	private static int solution(int[] people, int limit){
		int answer = 0;

		// 무게제한 limit
		// 탑승인원 2

		// 정렬
		Arrays.sort(people);

		int left = 0;
		int right = people.length-1;

		while(left <= right){
			int sum = people[left]+people[right];

			// 가장 앞의 사람과 가장 끝의 사람의 합이 최대 무게보다 작거나 같은경우
			if(sum <= limit){
				left++;
			}
			right--;
			answer++;
		}
		return answer;
	}
}
