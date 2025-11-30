package 단계별풀이_old._25년_04월.복습및풀이_250407;

public class _002_JadenCase_문자열_만들기 {
	public static void main(String[] args) {
		solution("3people unFollowed me");
	}
	public static  String solution(String s) {
		String answer = "";

		String tmp = s.replaceAll(" ","_");

		String[] temp = s.split("");

		// 조건 1. 단어의 첫 문자가 대문자이고 그외에는 소문자다.
		// 조건 2. 첫 문자가 알파벳이 아닌 숫자 일경우 모두 소문자로
		int j = 0;
		for(int i = 0; i < temp.length; i++){
			String inner = temp[i];
			String addString = "";
			// 조건 1 공란이 아닌경우
			if(!inner.equals("_")){
				// 숫자 인경우
				if(inner.matches("^[0-9]*$")) {
					addString = inner;
					j++;
				} else if(j == 0){
					addString = inner.toUpperCase();
					j++;
				} else {
					addString = inner.toLowerCase();
					j++;
				}
				// 공란일 경우
			} else {
				j = 0;
				addString = " ";
			}
			answer += addString;
		}

		return answer;
	}
	// 1회차 f, idx = 0; toUpperCase -> 첫번째이면서, 영어이기 때문에 대문자로
	// 2회차 o, idx = 1; toLowerCase -> 첫번째가 아니고, 영어이기 때문에 소문자로
	// 3회차 r, idx = 2; toLowerCase -> 첫번째가 아니고, 영어이기 때문에 소문자로
	// 4회차 _, idx = 0; 공란이 나오면 인덱스를 0으로 변환
}
