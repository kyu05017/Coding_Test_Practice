package 프로그래머스.Lv0.편지;

public class 편지 {
	public static void main(String[] args){
		String m = "I love you~";
		System.out.println(sol(m));
	}
	private static int sol(String m ){
		return m.length()*2;
	}
}
