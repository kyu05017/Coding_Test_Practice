package 프로그래머스.Lv0.두수의_나눗셈;

/**
 *  문제 설명
 *  정수 num1과 num2가 매개변수로 주어질 때,
 *  num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
 */

public class 두수의_나눗셈 {

	public static int solution(int a,int b) {
		return (int)(((double)a/(double)b)*1000);
	}
}
