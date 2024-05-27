package 프로그래머스.Lv1.명예의전당_1;

import java.util.ArrayList;
import java.util.List;

public class 명예의전당_1 {

	public static void main(String[] args) {
		int[] a = {10, 100, 20, 150, 1, 100, 200};
		a(3,a);
	}

	public static int[] a(int k, int[]score){
		int[] answer = {};
		List<Integer> k_list = new ArrayList<>();

		for(int j : score) {

			if(k_list.size() < k) {
				k_list.add(j);
			} else {

			}


		}
		System.out.println(k_list.size());
		return answer;
	}
}
