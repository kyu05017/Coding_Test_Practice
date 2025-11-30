package 단계별풀이_old.연습.Lv0.짝수의합;

import java.util.stream.IntStream;

public class 짝수의합 {
	public static void main(String[] args){
		int n = 10;
		System.out.println(sol(n));
	}

	public static int sol(int n){
		int answer = 0;

		// n이하 정수의 값들을 답는다
		answer  = IntStream.rangeClosed(0, n).filter(value -> value % 2 == 0).sum();

		return answer;
	}
}
