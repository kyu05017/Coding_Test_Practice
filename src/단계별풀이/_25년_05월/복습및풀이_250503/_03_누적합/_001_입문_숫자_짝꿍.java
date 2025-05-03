package 단계별풀이._25년_05월.복습및풀이_250503._03_누적합;

import java.util.*;
import java.util.stream.Collectors;

public class _001_입문_숫자_짝꿍 {
	public static void main(String[] args) {
		System.out.println(solution("5525","1255"));
	}

	private static String solution(String X, String Y){
		int[] cntX = new int[10]; /// 0 ~ 9 가 몇번 나왔는지
		int[] cntY = new int[10]; /// 0 ~ 9 가 몇번 나왔는지

		///  각 숫자 세기
		for(char c : X.toCharArray()) cntX[c-'0']++;
		for(char c : Y.toCharArray()) cntY[c-'0']++;

		/// 9부터 0 까지 큰수 만들기
		StringBuilder sb = new StringBuilder();

		for(int i = 9; i >= 0; i--){
			int cnt = Math.min(cntX[i], cntY[i]);
			System.out.println("cnt : "+cnt);
			for(int j = 0; j < cnt; j++){
				sb.append(i);
			}
		}

		///  예외 처리
		if(sb.isEmpty())return "-1";        // 겹치는 숫자가 없음
		if(sb.charAt(0) == '0')return "0";  // "0000..." 같은 경우는 정답은 "0"

		return sb.toString();
	}

	/**
	 * 내풀이 ( 실패 )
	 * 사유 : 짝지어지는 수가 아닌 중복 제거로 올바르지 않은 답을 도출
	 */
	public static String solution1(String X, String Y) {
		String answer = "";

		Map<String,Integer> map = new HashMap<>();

		char[] arr_x = X.toCharArray();
		char[] arr_y = Y.toCharArray();

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		for(char c : arr_x){
			list1.add(String.valueOf(c));
		}
		for(char c : arr_y){
			list2.add(String.valueOf(c));
		}
		list1.retainAll(list2);
		System.out.println(list1.toString());
		list1 = list1.stream().distinct().collect(Collectors.toList());

		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1.toString());
		if(!list1.isEmpty()){
			StringBuilder sb = new StringBuilder();

			for(String s : list1){
				sb.append(s);
			}
			return sb.toString();
		}

		return "-1";
	}
}
