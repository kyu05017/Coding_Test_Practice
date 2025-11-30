package old.단계별풀이_old._25년_04월.복습및풀이_250412;

import java.util.stream.Collectors;

public class _009_시저_암호 {
	public static void main(String[] args) {
		System.out.println(solution("Z A z a", 4));
		System.out.println((int)'A');
		System.out.println((int)'Z'-'A');
		System.out.println((int)'a');
		System.out.println((int)'z');

		System.out.println((char)(('Z'-'A'+4)%26+'A'));
	}
	private static String solution(String s, int n){
		return s.chars() // IntStream 변환
				.mapToObj( c-> {
					if( c == ' ')return " ";        // 띄어쓰기면 문자열 띄어 쓰기 반환
					if(Character.isUpperCase(c)) { // 대문자라면
						return String.valueOf( // String 으로 반환
								(char)((c - 'A' + n) % 26 + 'A')
						);
					}
					else { // 소문자 라면
						return String.valueOf(
								(char)  // 자바 내부적으로는 int로 계산하기에 Char형으로 형변환
								((c - 'a' + n) // 받은 char를 대문자 A : 65 만큼 빼서 A에서의 거리를 구하고 + 이동할 거리
								% 26 + 'a') // 26으로 나눠
						);
					}
				})
				.collect(Collectors.joining()); // 하나로 조인
	}
	// 기본풀이
	private static String solution1(String s, int n){
		String answer = "";
		char[] t = {};
		for(char c : s.toCharArray()){
			boolean isUpperYn = (c > 64 && c < 97);

			if(c != 32){
				int result = 0;
				c += n;
				// 대문자인 경우
				if(isUpperYn && c > 90) {
					c -= 90;
					result = 64+c;
					answer += (char)result;
				}
				// 소문자인 경우
				else if(!isUpperYn && c > 122) {
					c -= 122;
					result = 96+c;
					answer += (char)result;
				} else {
					result = c;
					answer += (char)result;
				}
			} else {
				answer += " ";
			}
		}
		return answer;
	}
}
