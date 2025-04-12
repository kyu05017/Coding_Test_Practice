package 단계별풀이.연습.Lv1.콜라_문제;

/**
 * 콜라문제
 *  콜라 빈병을 2개 가져다주면 콜라 1병을 주는 마트가 있다. 빈 병 20개를 가져다 주면 몇병을 받을 수 있는가?
 *  단, 보우 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.
 */

public class 콜라_문제 {

	public static void main(String[] arg) {
		solution(2,1,20);
	}
	public static int solution(int a,int b,int n){
		int answer = 0;

		while(n>=a){
			answer += (n/a) *b;
			System.out.println(answer);
			n = ((n/a)*b + n%a);
			System.out.println(n);
		}

		return answer;
	}
}
