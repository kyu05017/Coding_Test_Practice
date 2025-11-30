package 단계별풀이_old._25년_04월.복습및풀이_250406;

public class _005_자릿수_더하기 {
	public static void main(String[] args) {

	}
	public int solution(int n) {
		int answer = 0;

		String[] temp = String.valueOf(n).split("");

		for(String i : temp){
			answer += Integer.parseInt(i);
		}

		return answer;
	}
}
