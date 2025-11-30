package 단계별풀이_old.연습.Lv0.약수의합;

import java.util.stream.IntStream;

public class 약수의합 {
	public static void main(String[] args) {
		System.out.println(sol(12));
	}
	private static int sol(int n){
		return IntStream.rangeClosed(1,n).filter(e-> n%e == 0 ).sum();
	}
}
