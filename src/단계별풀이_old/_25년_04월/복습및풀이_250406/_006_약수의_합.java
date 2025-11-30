package 단계별풀이_old._25년_04월.복습및풀이_250406;

public class _006_약수의_합 {
	public static void main(String[] args) {

	}
	public int solution(int n) {
		int answer = 0;

		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				answer += i;
			}
		}

		return answer;
	}
}
