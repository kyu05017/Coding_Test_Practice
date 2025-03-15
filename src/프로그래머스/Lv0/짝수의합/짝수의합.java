package 프로그래머스.Lv0.짝수의합;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
