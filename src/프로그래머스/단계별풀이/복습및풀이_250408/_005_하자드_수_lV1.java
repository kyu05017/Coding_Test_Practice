package 프로그래머스.단계별풀이.복습및풀이_250408;

public class _005_하자드_수_lV1 {
	public static void main(String[] args) {

	}
	// 내 코드
	/**
	 * 풀이 시간 : 3분]
	 *
	 * 느낀점 :
	 * 하자드 수에 대해 알게 되었다
	 * 하자드 수란 각 자리수의 합이 원본과 딱 나누어 떨어지는 수!
	 * 12 => 1+2 => 3 => 12%3 = 0 => 하자드수!
	 * 예전에 풀었던 문제지만, 기억도 안났지만 금방 풀었어!
	 * */
	public boolean solution(int x) {
		boolean answer = true;

		String[] temp = String.valueOf(x).split("");
		int tmp = 0;
		for(int i = 0; i < temp.length; i++){
			tmp += Integer.parseInt(temp[i]);
		}
		return (x%tmp==0)?true:false;
	}

	///  리팩토링 1번
	private static boolean solution1(int x){
		String[] temp = String.valueOf(x).split("");
		int tmp = 0;
		for(String s : temp){
			tmp += Integer.parseInt(s);
		}
		return x % tmp==0;
	}

	///  리팩토링 2번 (체이닝화)
	private static boolean solution3(int x){
		int tmp = String.valueOf(x)
				.chars() // return IntStream()
				.map( c -> c - '0') // 문자를 숫자로 변환
				.sum(); // 자바 내부 소스상 char의 숫자는 정수로 계산 곧 합계
		return x%tmp==0;
	}
}
