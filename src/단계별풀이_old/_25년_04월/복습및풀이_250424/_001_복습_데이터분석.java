package 단계별풀이_old._25년_04월.복습및풀이_250424;

import java.util.*;

public class _001_복습_데이터분석 {
	public static void main(String[] args) {
		int[][] sol = solution2(new int[][]{{1, 20300104, 100, 80},{2, 20300804, 847, 37},{3, 20300401, 10, 8}},"date",20300501,"remain");
		for(int[] s : sol){
			System.out.println(Arrays.toString(s));
		}
	}
	// 기본 풀이 ver1 + 람다 정렬
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
	// 복습 및 리팩토링
	private static int[][] solution2(int[][] data, String ext, int val_ext, String sort_by) {

		int[][] answer = {};

		List<List<Integer>> list = new ArrayList<>();

		// 검사될 단어를 미리 저장
		String[] check_list = {"code", "date", "maximum", "remain"};

		// 검사될 인덱스를 미리 저장
		int check_ext = 0,check_sort=0;

		// 정렬될 인덱스 정리
		for(int i = 0; i < check_list.length; i++){
			check_ext = (check_list[i].equals(ext))?i:check_ext;
			check_sort = (check_list[i].equals(sort_by))?i:check_sort;
		}

		// 데이터 정제
		for (int[] temp : data) {
			int check_data = temp[check_ext];
			if (check_data < val_ext) {
				List<Integer> temp_list = new ArrayList<>();
				for (int t : temp) temp_list.add(t);
				list.add(temp_list);
			}
		}

		// 데이터 정렬
		int final_orderBy = check_sort;
		Collections.sort(list, (a,b) -> a.get(final_orderBy) - b.get(final_orderBy));

		answer = new int[list.size()][4];
		for(int i = 0; i < answer.length; i++){
			List<Integer> temp_list = list.get(i);
			int[] temp_arr = new int[4];
			for(int j = 0; j < 4; j++){
				temp_arr[j] = temp_list.get(j);
			}
			answer[i] = temp_arr;
		}
		return answer;
	}
	// 복습 및 리팩토링
	private static int[][] solution3(int[][] data, String ext, int val_ext, String sort_by) {

		int[][] answer = {};

		List<List<Integer>> list = new ArrayList<>();

		// 검사될 단어를 미리 저장
		String[] check_list = {"code", "date", "maximum", "remain"};

		// 검사될 인덱스를 미리 저장
		int check_ext = 0,check_sort=0;

		// 정렬될 인덱스 정리
		for(int i = 0; i < check_list.length; i++){
			check_ext = (check_list[i].equals(ext))?i:check_ext;
			check_sort = (check_list[i].equals(sort_by))?i:check_sort;
		}

		// 데이터 정제
		for (int[] temp : data) {
			int check_data = temp[check_ext];
			if (check_data < val_ext) {
				List<Integer> temp_list = new ArrayList<>();
				for (int t : temp) temp_list.add(t);
				list.add(temp_list);
			}
		}

		// 데이터 정렬
		int N = check_sort;
		Collections.sort(list, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> a, List<Integer> b) {
				return a.get(N) - b.get(N);  // 오름차순 정렬 기준
			}
		});

		answer = new int[list.size()][4];
		for(int i = 0; i < answer.length; i++){
			List<Integer> temp_list = list.get(i);
			int[] temp_arr = new int[4];
			for(int j = 0; j < 4; j++){
				temp_arr[j] = temp_list.get(j);
			}
			answer[i] = temp_arr;
		}
		return answer;
	}
	// 복습 및 리팩토링
	private static int[][] solution4(int[][] data, String ext, int val_ext, String sort_by) {

		List<int[]> filteredList = new ArrayList<>();

		Map<String, Integer> colIndex = new HashMap<>();
		colIndex.put("code", 0);
		colIndex.put("date", 1);
		colIndex.put("maximum", 2);
		colIndex.put("remain", 3);

		int extIdx = colIndex.get(ext);
		int sortIdx = colIndex.get(sort_by);

		// 1. 필터링
		for (int[] row : data) {
			if (row[extIdx] < val_ext) {
				filteredList.add(row);
			}
		}

		// 2. 정렬 - Comparator로 (람다 사용 안 함)
		Collections.sort(filteredList, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[sortIdx] - b[sortIdx];
			}
		});

		// 3. List → 배열 변환
		int[][] answer = new int[filteredList.size()][4];
		for (int i = 0; i < filteredList.size(); i++) {
			answer[i] = filteredList.get(i);
		}

		return answer;
	}
}
