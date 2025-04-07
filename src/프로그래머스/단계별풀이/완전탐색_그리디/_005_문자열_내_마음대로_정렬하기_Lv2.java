package 프로그래머스.단계별풀이.완전탐색_그리디;

import java.util.Arrays;

public class _005_문자열_내_마음대로_정렬하기_Lv2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"},1)));
	}
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, (s1, s2) -> {
			char c1 = s1.charAt(n);
			char c2 = s2.charAt(n);

			// n번째 문자가 같으면 문자열 전체 비교
			if (c1 == c2) {
				return s1.compareTo(s2); // 사전순 정렬
			} else {
				return Character.compare(c1, c2); // n번째 문자 기준 정렬
			}
		});
		return strings;
	}
	/// 복습
	private static String[] sol(String[] strings, int n){
		Arrays.sort(strings,(s1,s2)->{
			char c1 = s1.charAt(n);
			char c2 = s2.charAt(n);

			// n번째 문자가 같으면 문자열 전체를 비교
			if(c1 == c2){
				return s1.compareTo(s2);
			} else {
				return Character.compare(c1,c2);
			}
		});
		return strings;
	}
}
