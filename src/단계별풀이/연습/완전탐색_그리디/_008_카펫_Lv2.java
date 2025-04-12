package 단계별풀이.연습.완전탐색_그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _008_카펫_Lv2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution2(24,24)));
	}
	// 실패 -> 안쪽크기 비교를 안함
	private static int[] solution1(int brown, int yellow){
		int[] answer = new int[2];

		// 결과 제한 사항
		// 가로세로 길이는 같을 수 있으며, 가로의 길이는 세로보다 길다

		// 1. 전체 넓이를 구한다.
		int size = brown + yellow;

		// 2. 약수를 구한다.
		List<Integer> list = new ArrayList<>();
		for(int i = 2; i < size; i ++){
			if(size % i == 0){
				list.add(i);
			}
		}

		// 전체 넓이 만 구하려고 함
		if(list.size()%2==0){
			int left = ((list.size()/2)-1);
			int right = (list.size()-1)-left;

			answer[0] = Math.max(list.get(left),list.get(right));
			answer[1] = Math.min(list.get(left),list.get(right));
		} else {
			answer[0] = list.get(0);
			answer[1] = list.get(0);
		}
		// 오답 사유 : yellow의 값을 무시함
		return answer;
	}
	// 성공
	private static int[] solution2(int brown, int yellow){
		// 답의 크기는 항상 2개로 구성됨으로 크기 고장
		int[] answer = new int[2];

		// 가로 세로 합으로 총 싸이즈를 구한다.
		int size = brown + yellow;

		// 세로의 길이가 yellow를 최소 1개라고 포함 해야한다면 세로길이는 3부터 시작
		for(int row = 3; row <= size; row++){
			// 가로 크기 구하기 ( 역순 )
			int col = size/row;

			System.out.println("세로 : "+row+" 가로 : "+col);

			// 전체 크기에서 세로 길이가 약수이며, 가로 길이도 yellow를 하나 이상 항상 포함 하기 위해 전체 길이 3이상일 경우
			if(size % row == 0 && col >= 3){
				// 안쪽 크기 = 가로 와 세로 모두 겉을 감싸는 하나씩 총 2를 뺀다.
				int inner = (row - 2) * (col - 2);

				// 안쪽 크기가 주어진 yellow의 크기와 같을 경우 정답
				if(inner == yellow){
					// 가로 길이가 크거나 같이 때문에 [0] = 큰 값 , [1] = 작은 값
					return new int[]{Math.max(row, col), Math.min(row, col)};
				}
			}
		}

		return answer;
	}
}
