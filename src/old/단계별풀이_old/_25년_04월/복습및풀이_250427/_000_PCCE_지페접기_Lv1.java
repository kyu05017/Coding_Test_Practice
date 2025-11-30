package old.단계별풀이_old._25년_04월.복습및풀이_250427;

public class _000_PCCE_지페접기_Lv1 {
	public static void main(String[] args) {
		System.out.println("풀이 : "+solution(new int[]{30,15},new int[]{26,17}));
		System.out.println("풀이 : "+solution(new int[]{50,50},new int[]{100,241}));
	}
	private static int solution(int[] wallet, int[] bill){
		/**
		 * 아이디어 :
		 *            1. 지폐를 접은 횟수를 저장할 변수 answer
		 *            2. 반복문을 이용해 bill의 값이 wallet보다 작은 값 보다 크거나 bill의 큰 값이 wallet 의 큰값 보다 큰 동안 반복 (while)
		 *                  3-0. bill[0] 이 bill[1] 보다 크다면
		 *                      3-1. bill[0]을 2로 나누고 나머지는 버림
		 *                  3-2. 아니라면
		 *                      3-3. bill[1]을 2로 나누고 나머지는 버림
		*                   3-4. answer 1증가
		 *             4. answer 을 반환
		 *
		 * 시간복잡도 : N(lon)
		 *
		 * 자료구조 : while 그리디
		 */

		int answer = 0;

		while(( Math.min(bill[0],bill[1]) >  Math.min(wallet[0],wallet[1]))||(Math.max(bill[0],bill[1]) >  Math.max(wallet[0],wallet[1]))){
			if(bill[0] > bill[1]){
				bill[0] = bill[0]/2;
			} else {
				bill[1] = bill[1]/2;
			}
			answer++;
		}

		return answer;
	}
}
