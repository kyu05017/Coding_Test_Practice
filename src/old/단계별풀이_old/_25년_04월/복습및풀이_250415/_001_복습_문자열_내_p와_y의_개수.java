package old.단계별풀이_old._25년_04월.복습및풀이_250415;

public class _001_복습_문자열_내_p와_y의_개수 {
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
	}
	static boolean solution(String s){
		String tmp = s.toLowerCase();
		return tmp.chars().filter( c -> c=='y').count() == tmp.chars().filter(c -> c =='p').count();
	}
}
