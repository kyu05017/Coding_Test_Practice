package 단계별풀이._25년_04월.복습및풀이_250416;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _001_복습_369문제 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution01(40)));
		solution02(40);
		solution03(40);
	}
	// 기본 369
	private static int[] solution01(int n){
		return IntStream.rangeClosed(1,n).filter( e -> {
			String s = String.valueOf(e);
			return s.contains("3") || s.contains("6") || s.contains("9");
		}).toArray();
	}

	// 369 박수의 갯수
	private static void solution02(int n){
		long result = IntStream.rangeClosed(1,n).filter( e ->{
			String s = String.valueOf(e);
			return s.contains("3") || s.contains("6") || s.contains("9");
		}).count();
		System.out.println("박수의 갯수 : "+result);
	}

	// 369 짝 버전
	private static void solution03(int n){
		IntStream.rangeClosed(1, n)
				.mapToObj(i -> {
					String s = String.valueOf(i);
					long count = s.chars().filter(c -> c == '3' || c == '6' || c == '9').count();
					return count > 0 ? "짝".repeat((int) count) : s;
				})
				.forEach(System.out::println);
	}
}
