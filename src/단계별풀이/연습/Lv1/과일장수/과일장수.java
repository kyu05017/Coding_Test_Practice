package 단계별풀이.연습.Lv1.과일장수;

import java.util.Arrays;
import java.util.Collections;

public class 과일장수 {

	public static void main(String[] args) {
//		int[] s = {1,2,3,1,2,3,1};
//		int k = 3;
//		int m = 4;

		int[] s = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		int k = 4;
		int m = 3;

		sol(k,m,s);

	}

	private static int sol(int k, int m, int[] score){
		int result  = 0;

		int boxes = score.length/m;

		Integer[] tempArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(tempArr,Collections.reverseOrder());
		int cnt = 0;
		for(int i = 0; i < boxes; i++){

			int min = Integer.MAX_VALUE;
			for(int j = 0; j < m; j++){
				if(tempArr[j+cnt] < min){
					min = tempArr[j+cnt];
				}
			}
			result += min*m;
			cnt += m;
		}
		return result;
	}
}
