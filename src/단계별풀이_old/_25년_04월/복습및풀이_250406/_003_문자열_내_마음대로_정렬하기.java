package 단계별풀이_old._25년_04월.복습및풀이_250406;

import java.util.Arrays;

public class _003_문자열_내_마음대로_정렬하기 {
	public static void main(String[] args) {

	}
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];


		for(int i = 0; i < strings.length; i++){
			String tmp = String.valueOf(strings[i].charAt(n));
			answer[i] = tmp+strings[i];
		}

		Arrays.sort(answer);

		for(int i = 0; i < answer.length; i++){
			answer[i] = answer[i].substring(1,answer[i].length());
		}
		return answer;
	}
}
