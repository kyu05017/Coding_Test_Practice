package 단계별풀이_old._25년_04월.복습및풀이_250413;

public class _001_복습_문자열_내_p와_y의_개수_Lv1 {
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
	}
	// 기본 반복문 복습 - 새로운 아이디어!
	private static boolean solution(String s){
		// 모두 소문자로 만든다.
		int answer = 0;
		for(char c : s.toLowerCase().toCharArray()){
			// p 카운트, y 카운트
			if(c == 'p'){
				answer++;
			}else if(c == 'y'){
				answer--;
			}
		}
		// p 와 y 숫자가 같으면 true, 다르면 false
		return (answer == 0);
	}

	// 스트림 복습
	private static boolean solution1(String s){
		// 문자열을 모두 소문자로!
		// 문자열을 chars() intStream화 시키고
		// 필터로 p / y 만 카운트 해서 같은지체크
		return s.toLowerCase().chars().filter(c-> c == 'p').count() == s.toLowerCase().chars().filter(c-> c == 'y').count();
	}
}
