package 프로그래머스.단계별풀이.완전탐색;

public class _003_최소_직사각형 {
	public static void main(String[] args) {
		System.out.println(solution(new int[][]{{60, 50},{30,70},{60,30},{80,40}}));
	}

	public static int solution(int[][] sizes) {
		int answer = 0;

		int maxW = 0;
		int maxH = 0;

		for(int[] s : sizes){
			int w = Math.max(s[0],s[1]);
			int h = Math.min(s[0],s[1]);

			if(maxW < w){
				maxW = w;
			}

			if(maxH < h){
				maxH = h;
			}
		}
		return maxW*maxH;
	}
}
