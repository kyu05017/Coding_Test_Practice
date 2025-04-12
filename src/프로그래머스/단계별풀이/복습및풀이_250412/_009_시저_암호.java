package 프로그래머스.단계별풀이.복습및풀이_250412;

import java.util.Arrays;

public class _009_시저_암호 {
	public static void main(String[] args) {
		System.out.println(solution("Z A z a", 4));
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');

	}
	private static String solution(String s, int n){
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
