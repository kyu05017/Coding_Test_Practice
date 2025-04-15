package 단계별풀이._25년_04월.복습및풀이_250406;

public class _007_제곱근_구하기 {

	public static void main(String[] args) {

	}
	public long solution(long n) {
		long tmp = (long)Math.sqrt(n);
		return ((long)(tmp * tmp) == n) ? ((long)tmp +1) *((long)tmp +1) : -1;
	}
	/**
	 * 풀이법
	 * 1. 받은 long정수를 Math.sqrt() 를 사용해서 제곱근을 구한다.
	 * 2. 생성한 제곱근을 곱해서 n이랑 같다면 제곱근에 +1을 더해 제곱한다.
	 * 3. 같지 않다면, -1 출력
	 *
	 * 내 추론:
	 * 3이나 5같이 제곱근이 소수점으로 떨어지는 숫자들은
	 * 부동소수점으로 인해 다시 제곱근을 곱한다 한들 원래 숫자가 나오지 않음으로
	 * n이랑 같을수 없다고 생각해
	 */

}
