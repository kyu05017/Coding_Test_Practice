package 단계별풀이._25년_04월.복습및풀이_250426;

import java.util.*;
import java.util.stream.Collectors;

public class _006_PCCP_외톨이알파벳 {
	public static void main(String[] args) {
		System.out.println(solution("edeaaabbccd"));
	}
	private static String solution(String input_string){

		// 외톨이가 아닌 문자열 담기
		List<Character> input = new ArrayList<>();
		// TreeSet은 자동 정렬, 중복 방지
		Set<Character> result = new TreeSet<>();
		String answer = "";
		char prev = ' ';

		for(int i = 0; i < input_string.length(); i++){
			char is = input_string.charAt(i);
			if(is != prev){
				if(input.contains(is)){
					result.add(is);
				} else {
					input.add(is);
				}
			}
			prev = is;
		}

		StringBuilder sb = new StringBuilder();
		for(Character c : result){
			sb.append(c);
		}

		return (sb.length() == 0)?"N":sb.toString();
	}
}
