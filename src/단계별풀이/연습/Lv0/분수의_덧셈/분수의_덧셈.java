package 단계별풀이.연습.Lv0.분수의_덧셈;

public class 분수의_덧셈 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {

		int n = denom1 * denom2;//분모의 곱
		int de = (numer1 * denom2) + (numer2 * denom1);//분자의 합
		int count = task(n,de);

		return new int[]{de / count, n / count};
	}

	private int task(int n, int de){
		int count = 1;

		for(int i = 1; i <= n && i <= de; i++) {    //최대 공약수
			count = (n % i == 0 && de % i == 0) ? i : count;
		}

		return count;
	}
}
