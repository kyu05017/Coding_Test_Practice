package 프로그래머스.단계별풀이.기초단계;

public class _005_문자열_다루기_기본 {
	public static void main(String[] args) {
		System.out.println(solution("a234"));
	}

	// 오답 노트
	public static boolean solution(String s) {
		boolean answer = false;

		// 문자열이 숫자가 포함되어있더라도 길이가 6 또는 4라면 참을 반환
		if(s.length() == 6 || s.length() ==4){
			return true;
		}
		String[] tmp = s.split("");
		for(int i=0; i < tmp.length;i++){
			if(!tmp[i].matches("[0-9]")){
				return false;
			}
		}

		return answer;
	}

	// 수정
	public static boolean solution_re(String s) {

		// 길이로 체크
		if(s.length() == 6 || s.length() ==4){
			return false;
		}
		// 정규식으로 체크
		if(!s.matches("\\d{4}|\\d{6}")){
			return false;
		}

		// 문자열로 변환 후 체크
		String[] tmp = s.split("");
		for(int i=0; i < tmp.length;i++){
			if(!tmp[i].matches("[0-9]")){
				return false;
			}
		}
		// 삼항 연산자로 풀기
		boolean temp = (s.length() == 4 || s.length() == 6) && s.chars().allMatch(Character::isDigit);
		// chars() => 문자열을 int형 문자 스트림으로 변환
		// allMatch(Character::isDigit) => 모든 문자가 숫자인지 검사

		// try-catch 로 체크
		try {
			Integer.parseInt(s);  // 숫자 형태인지 검사
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}


}
