package 단계별풀이_old.연습.완전탐색;

public class _002_1_소수만들기_복습 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,7,6,4}));
	}

	/**
	 ⏱️ 소요 시간	2분 33초 (엄청 빠름!)
	 ✅ 조합 구현	i < j < k 완벽
	 ✅ 소수 판별	함수 분리 & 구조 잘 기억함
	 💡 개선 포인트	isPrime()에서 Math.sqrt(n) 사용하면 더 효율적
	 */
	public static int solution(int[] nums) {
		int answer = 0;
		int sum = 0;
		for(int i = 0; i < nums.length;i++){
			for(int j = i+1; j < nums.length; j++){
				for(int k = j +1; k < nums.length; k++){
					sum = nums[i] + nums[j] + nums[k];
					if(isPrime(sum))answer++;
				}
			}
		}

		return answer;
	}

	private static boolean isPrime(int n){
		// 최적화 추가 + 제곱근으로 풀기
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}

		// 내풀이
		for(int i = 2; i < n; i++){
			if(n % i == 0)return false;
		}
		return true;
	}
}
