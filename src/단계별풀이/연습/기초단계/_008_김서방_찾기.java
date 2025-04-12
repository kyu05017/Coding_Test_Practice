package 단계별풀이.연습.기초단계;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _008_김서방_찾기 {

	/**
	 ✅ 스트림 활용	Arrays.stream(seoul)으로 배열을 리스트처럼 활용
	 ✅ .toList()	자바 16+ 이상일 경우 List 변환 깔끔하게 사용
	 ✅ .indexOf("Kim")	리스트에서 "Kim"의 위치 찾기 정확함
	 ✅ 문자열 연결	"김서방은 X에 있다" 포맷 정확히 맞춤
	 */
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"Jane", "Kim"}));
	}

	// 자바 16버전 이상
	public static String solution(String[] seoul) {
		return "김서방은 "+Arrays.stream(seoul).toList().indexOf("Kim")+"에 있다";
	}

	// 기존 스트림 활용
	public static String solution1(String[] seoul) {
		return "김서방은 "+Arrays.stream(seoul).collect(Collectors.toList()).indexOf("Kim")+"에 있다";
	}

	// asList .활용
	public static String solution2(String[] seoul) {
		return "김서방은 "+Arrays.asList(seoul).indexOf("Kim")+"에 있다";
	}

	// 반복문 활용
	public static String solution3(String[] seoul) {
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				return "김서방은 " + i + "에 있다";
			}
		}
		return "";
	}
}
