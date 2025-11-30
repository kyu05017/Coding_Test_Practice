package 단계별풀이_old._25년_04월.복습및풀이_250428._02_자료구조;

import java.util.Scanner;

public class _01_000_숫자의_합_구하기 {
	/**
	 *  수도 코드
	 * 1. N값 입력 받기
	 * 2. 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
	 * 3. sNum을 다시 char[]형 배열로 변환 하여 저장하기
	 * 4. int형 변수 answer를 선언하기
	 * 5. for(cNum 길이만큼 반복하기)
	 * 6. 배열의 각 자리값을 정수형으로 변환하며 answer에 더하여 누적하기
	 * 7. answer 반환
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		String nums = sc.next();
		char[] arr = nums.toCharArray();

		int answer = 0;
		for(char c : arr){
			answer += (c-'0');
		}
		System.out.println(answer);
	}
}
