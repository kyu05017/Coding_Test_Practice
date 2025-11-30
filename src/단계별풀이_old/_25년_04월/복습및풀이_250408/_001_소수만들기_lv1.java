package 단계별풀이_old._25년_04월.복습및풀이_250408;

public class _001_소수만들기_lv1 {
	public static void main(String[] args) {

	}
	/**
	 풀이 시간 : 2분

	 느낀점 어제 풀면서 정리했던 내용이 떠올라서 금방 풀었어

	 풀이의 요점 :
	 소수는 1과 자기자신 밖에 없기때문에, 2부터 ~ n 미만까지
	 하나라도 정확이 나누어져 나머지가 없다면 소수가 아니다.
	 */
	public int solution(int[] nums) {
		int answer = 0;

		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				for(int k = j+1; k < nums.length; k++){
					int s = nums[i]+nums[j]+nums[k];
					if(isPrime(s))answer++;
				}
			}
		}
		return answer;
	}
	private boolean isPrime(int n){
		for(int i = 2; i < n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
