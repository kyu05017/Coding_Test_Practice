package 단계별풀이_old.연습.Lv0.중복된_숫자_개수;

import java.util.Arrays;

/**
 * 문제 설명
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 */

public class 중복된_숫자_개수 {
	public int solution(int[] a, int n) {
		int answer1 = 0;

		// for문 풀이
		for(int temp : a){
			answer1 += (temp == n)?1:0;
		}

		// 스트림 풀이
		int answer2 = (int)Arrays.stream(a).filter(e -> e == n).count();
		//Arrays.stream 으로 입력받은 int[] a를 filter 로 n과 같은것만 카운트 한다.

		return answer1;
	}
}
