package old.단계별풀이_old.연습.Lv1.소수_만들기;

public class 소수__만들기 {

	public static void main(String[] args) {

		int[] num = {1,2,3,4};
		sol01(num);
	}


	private static void sol01(int[] nums){

		int answer = 0;
		int sum =0;

		for(int i=0; i<nums.length; i++){
			for(int j=i+1; j<nums.length; j++){
				for(int k=j+1; k<nums.length; k++){
					//배열 중 3개 더하기
					sum = nums[i]+nums[j]+nums[k];
					//소수 찾기(소수이면 +1)
					if(isPrime(sum)){
						answer++;
					}
				}
			}
		}

		System.out.println("\n"+answer);
	}

	private static boolean isPrime(int n){

		for(int i = 2; i < n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;

	}
}
