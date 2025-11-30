package old.단계별풀이_old._25년_04월.복습및풀이_250418;

import java.util.Arrays;

public class _003_복습_카펫_Lv2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10,2)));
	}
	private static int[] solution(int brown, int yellow){
		int[] answer = new int[2];

		// 총크기를 구한다.
		int total_size = brown + yellow;

		// 최소한으로 yellow를 가지고 있으려면 3 (brown : 2 | yellow : 1)
		for(int row = 3; row <= total_size; row++){
			int col = total_size/row;

			// 올바른 수만 정제
			if(total_size%row==0 && col >= 3){
				System.out.println("row : " + row + " || col : "+col);
				// 최소 한개라고 가정 했을 때에 겉에 있는 brown 을 제거 한 최대값
				int inner = (row-2)*(col-2);
				System.out.println("inner : "+inner);

				if(inner == yellow){
					answer[0] = Math.max(row,col);
					answer[1] = Math.min(row,col);
				}
			}

		}

		return answer;
	}
}
