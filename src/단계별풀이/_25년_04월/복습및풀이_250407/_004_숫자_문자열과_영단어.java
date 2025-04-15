package 단계별풀이._25년_04월.복습및풀이_250407;

import java.util.*;

public class _004_숫자_문자열과_영단어 {
	public static void main(String[] args) {
		solution("one4seveneight");
	}

	// 내풀이 - 성공
	public static int solution(String s) {
		int answer = 0;

		// 숫자를 받으면 영어로

		String[] temp = s.split("");

		Map<String,String> map = getMap();

		boolean isWord = false;
		String answerWord = "";
		String tempWord = "";
		List<String> list = new ArrayList<>();
		for(int i = 0; i < temp.length; i++){
			String word = temp[i];

			if(word.matches("^[0-9]*$")){
				answerWord += word;
			} else {
				list.add(word);
				if(!list.isEmpty()){
					for(int j = 0; j < list.size(); j++){
						tempWord += list.get(j);
					}
					if(map.get(tempWord) != null) {
						answerWord += map.get(tempWord);
						list = new Stack<>();
					}
					tempWord = "";
				}
			}
		}
		System.out.println(answerWord);

		return answer;
	}
	// 내 방식을 리펙토링 개선 버전
	private static int solution_reFactory(String s){
		int answer = 0;

		// 숫자를 받으면 영어로

		StringBuilder sb = new StringBuilder();
		Map<String,String> map = getMap();
		String temp = "";

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				sb.append(c);
			} else {
				temp += c;
				if (map.containsKey(temp)) {
					sb.append(map.get(temp));
					temp = "";
				}
			}
		}
		return Integer.parseInt(sb.toString());
	}
	// 문자열 치환 방식
	private static int solution_reFactory2(String s){
		String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for(int i = 0; i < strArr.length; i++) {
			s = s.replaceAll(strArr[i], Integer.toString(i));
		}
		return Integer.parseInt(s);
	}

	private static HashMap<String,String> getMap() {
		HashMap<String,String> map = new HashMap<>();

		map.put("zero","0");
		map.put("one","1");
		map.put("two","2");
		map.put("three","3");
		map.put("four","4");
		map.put("five","5");
		map.put("six","6");
		map.put("seven","7");
		map.put("eight","8");
		map.put("nine","9");

		return map;
	}
}
