package 단계별풀이.복습및풀이_250407;

public class _003_소수_만들기 {
	public static void main(String[] args) {

	}

	public int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (isPrime(sum)) answer++;
				}
			}
		}

		// 1회차 i = 0, j = 1, k = 2, 1+2+3 = 6 약수아님
		// 2회차 i = 0, j = 1, k = 3, 1+2+4 = 7 약수 answer += 1;
		// 3회차 i = 0, j = 2, k = 3, 1+3+4 = 8 약수아님
		// ...반복
		return answer;
	}

	private boolean isPrime(int a){
		// 소수 찾기
		// 소수는 약수로 자기 자신과 1만 가지고 있기 때문에,
		// 2부터 자기 자신 미만 까지 나누어 나머지가 없는 수가 존재한다면
		// 소수가 아님
		for(int i = 2; i < a; i++){
			if(a % i == 0){
				return false;
			}
		}
		return true;
	}
}
