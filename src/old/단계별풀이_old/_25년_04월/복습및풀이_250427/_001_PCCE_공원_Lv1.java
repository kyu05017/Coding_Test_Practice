package old.단계별풀이_old._25년_04월.복습및풀이_250427;

import java.util.Arrays;

public class _001_PCCE_공원_Lv1 {
	public static void main(String[] args) {

		int[] mats = {5,3,2};
		String[][] park = {
				{"A" , "A" , "-1", "B" , "B" , "B" , "B" , "-1"},
				{"A" , "A" , "-1", "B" , "B" , "B" , "B" , "-1"},
				{"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
				{"D" , "D" , "-1", "-1", "-1", "-1", "E" , "-1"},
				{"D" , "D" , "-1", "-1", "-1", "-1", "-1", "F" },
				{"D" , "D" , "-1", "-1", "-1", "-1", "E" , "-1"}
		};

		System.out.println("풀이 "+solution(mats,park));
	}
	///  완전 탐색
	private static int solution(int[] mats, String[][] park){
		int answer = 0;

		// 1. 매트를 큰 순서로 정렬
		Arrays.sort(mats);
		int n = mats.length;
		int[] reverse_arr = new int[n];
		for (int i = 0; i < n; i++) {
			reverse_arr[i] = mats[n - i - 1];
		}

		// 2. 공원 사이즈 구하기
		int parkSize = park.length; // 정사각형

		// 3. 매트 하나씩 시도
		for (int size : reverse_arr) {
			for (int i = 0; i <= parkSize - size; i++) {
				for (int j = 0; j <= parkSize - size; j++) {
					if (canPlaceMat(park, i, j, size)) {
						return size; // 찾으면 바로 리턴
					}
				}
			}
		}

		return answer;
	}
	// 특정 위치에 매트를 놓을 수 있는지 검사
	private static boolean canPlaceMat(String[][] park, int x, int y, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (!park[x + i][y + j].equals("-1")) {
					return false;
				}
			}
		}
		return true;
	}
}
