package 단계별풀이_old._25년_04월.복습및풀이_250424;

import java.util.stream.IntStream;

public class _003_연습_369게임 {
	// 3,6,9,가 포함된 갯수
	public static void main(String[] args) {
		int n = 40;
		System.out.println("1 : "+num1(n));
		System.out.println("총 박수 갯수 : " + num2(n));
	}
	// 3,6,9가 포함된 갯수
	private static int num1(int n){
		return (int)IntStream.rangeClosed(0,n).filter((e) -> (String.valueOf(e).contains("3") || String.valueOf(e).contains("6") || String.valueOf(e).contains("9")) ).count();
	}

	// 3,6,9가 몇번 나왔는지
	private static int num2(int n){
		return IntStream.rangeClosed(0,n).mapToObj(String::valueOf).mapToInt(e -> (int)e.chars().filter(c -> c == '3'||c == '6'||c=='9').count()).sum();
	}
}
