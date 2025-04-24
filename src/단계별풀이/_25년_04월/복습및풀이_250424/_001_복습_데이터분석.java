package 단계별풀이._25년_04월.복습및풀이_250424;

import java.util.*;

public class _001_복습_데이터분석 {
	public static void main(String[] args) {
		solution(new int[][]{{1, 20300104, 100, 80},{2, 20300804, 847, 37},{3, 20300401, 10, 8}},"date",20300501,"remain");
	}
	public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		int[][] answer = {};

		List<List<Integer>> list = new ArrayList<>();

		String[] check_list = {"code", "date", "maximum", "remain"};

		int check_ext = 0;
		int check_sort_by = 0;

		for(int i = 0; i < check_list.length; i++){
			String check = check_list[i];
			if(ext.equals(check)){
				check_ext = i;
			}
			if(sort_by.equals(check)){
				check_sort_by = i;
			}
		}
		System.out.println(check_sort_by);
		// 데이터 정제
		for(int i = 0; i < data.length; i++){

			List<Integer> temp = new ArrayList<>();
			int checked_data = data[i][check_ext];

			//정제될 값
			if(checked_data < val_ext){
				temp.add(data[i][0]);
				temp.add(data[i][1]);
				temp.add(data[i][2]);
				temp.add(data[i][3]);
			}

			if(!temp.isEmpty()){
				list.add(temp);
			}
		}

		// 정렬
		int finalCheck_sort_by = check_sort_by;
		list.sort((a, b) -> a.get(finalCheck_sort_by) - b.get(finalCheck_sort_by));

		answer = new int[list.size()][4];
		for(int i = 0; i < list.size(); i++){
			List<Integer> temp_list = list.get(i);
			int[] temp = new int[4];
			for(int j = 0; j < 4; j++){
				temp[j] = temp_list.get(j);
			}
			answer[i] = temp;
		}

		return answer;
	}
}
