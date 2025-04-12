package 단계별풀이.연습.Lv1.소수찾기;

public class 소수찾기 {

	public static void main(String[] args) {

		int n = 10;
		sol001(n);
	}

	private static void sol001(int n){
		int result = 1;
		for(int i = 3; i <= n; i++){

			result += isPrime(i)?1:0;
		}
//		return result;
		System.out.println(result);
	}

	private static boolean isPrime(int n){
		boolean result = true;
		System.out.println("n : "+ n);
		System.out.println( "(int) Math.sqrt(n) : "+(int) Math.sqrt(n));

		// 2 이상 부터 소수 이기 때문에 2부터 시작
		// 입력된 정수의 제곱근을 i로 나눈 나머지가 0에 수렴하면
		// 소수가 아님으로 false 처리
		// 제곱근을 안쓰는 경우 i < n
		// 제곱근을 사용하는 경우 i <= (int)Math.sqrt(n)

		// 제곱근 보다 i가 작을동안 i는 1씩 증가하고
		// n을 i로 나눈 나머지가 0으로 떨어진다면, n은 소수가 아니다.
		for(int i = 2; i <= (int) Math.sqrt(n); i++){
			System.out.println(n+"%"+i+" : "+n%i);
			if(n%i==0){
				result =  false;
			}
		}
		System.out.println();
		System.out.println("result : "+result);
		return result;

	}
}
