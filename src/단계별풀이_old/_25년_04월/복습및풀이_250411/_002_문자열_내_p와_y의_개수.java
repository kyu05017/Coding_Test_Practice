package 단계별풀이_old._25년_04월.복습및풀이_250411;

public class _002_문자열_내_p와_y의_개수 {
	public static void main(String[] args) {

	}

	private static boolean solution(String s){
		int p=0,y=0;
		String[] change_s = s.toLowerCase().split("");

		for(int i = 0; i < change_s.length; i++){
			if(change_s[i].equals("p")){
				p++;
			} else if(change_s[i].equals("y")){
				y++;
			}
		}
		return p==y;
	}

	private static boolean solution2(String s){
		return s.toLowerCase().chars().filter( c -> c=='p').count() == s.toLowerCase().chars().filter( c -> c=='y').count() ;
	}
}
