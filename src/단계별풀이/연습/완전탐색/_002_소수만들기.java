package 단계별풀이.연습.완전탐색;

public class _002_소수만들기 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,7,6,4}));
	}
	public static int solution(int[] nums) {
		int answer = 0;

		int sum = 0;

		for(int i = 0; i < nums.length; i ++){
			for(int j = i +1; j < nums.length; j++){
				for(int k = j+1; k < nums.length;k++){
					sum = nums[i]+ nums[j]+ nums[k];
					if(isOkay(sum)){
						answer++;
					}
				}
			}
		}

		return answer;
	}

	// 소수 - 완전탐색 버전
	public static boolean isOkay(int n){
		// 1과 자기자신을 제외 하고
		// n나누기 i를 했을때 하나라도 나머지가 0이 아니면 소수가 아니다
		for(int i = 2; i < n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

	// 소수찾기 - 제곱근 버전 ( 탐색 시간을 줄일 수 있다 )
	public static boolean isPrime(int n){
		if(n < 2) return false;

		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}
