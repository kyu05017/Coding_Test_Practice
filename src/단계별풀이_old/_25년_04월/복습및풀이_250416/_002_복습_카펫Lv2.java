package 단계별풀이_old._25년_04월.복습및풀이_250416;

import java.util.Arrays;

public class _002_복습_카펫Lv2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10,2)));
	}
	private static int[] solution(int brown, int yellow){
		// 답의 크기는 항상 2개로 구성됨으로 크기 고장
		int[] answer = new int[2];

		// 가로세로의 합으로 총 크기를 구한다/
		int size = brown + yellow;

		// 세로의 길이가  yellow를 최소 1개라도 포함 해야하기 때문에 최소 크기는 3
		for(int row = 3; row <= size; row++){

			// 가로 크기 구하기( 역순 )
			int col = size/ row;
			System.out.println("세로 : "+row+" 가로 : "+col);

			// 전체 크기에서 세로 길이가 약수이며(정사각형의 인접) yellow 를 최소 하나라도 포함 해야하기에 3이상
			if(size % row == 0 && col >= 3){

				// 안쪽 크기 => 가로 세로 모두 최소 하나씩 감싸야 하기 때문에 -2 씩 감소
				int inner =  (row-2)*(col-2);

				// 가로 길이가 크거나 같이 때문에 [0] = 큰 값 , [1] = 작은 값
				if(inner == yellow){
					return new int[]{Math.max(row, col), Math.min(row, col)};
				}
			}
		}
		return answer;
	}
}
