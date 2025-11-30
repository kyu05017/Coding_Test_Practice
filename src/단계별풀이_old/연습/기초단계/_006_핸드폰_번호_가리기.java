package 단계별풀이_old.연습.기초단계;

public class _006_핸드폰_번호_가리기 {
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
	}

	/**
	 ✅ String.repeat()	자바 11 이상에서 사용 가능한 깔끔한 반복문 대체
	 ✅ substring()	원하는 부분 잘라내기 정확
	 ✅ 변수명 간단	코드 흐름 이해하기 쉬움
	 ✅ 리턴식	한 줄로 끝내도 될 정도로 깔끔!
	 */
	// 초기 풀이
	public static String solution(String p) {
		String answer = p.substring(p.length()-4);
		String re = "*".repeat(p.length()-4);
		return re+answer;
	}
	public static String solution2(String p) {
		return  "*".repeat(p.length()-4)+p.substring(p.length()-4);
	}

}
