package old.단계별풀이_old._25년_04월.복습및풀이_250411;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _005_체육복_그리디 {
	public static void main(String[] args) {
		System.out.println(solution(5, new int[]{2,4}, new int[]{1, 2, 3}));
	}

	private static int solution(int n, int[] lost, int[] reserve){
		int answer = 0;

		Arrays.sort(lost);
		Arrays.sort(reserve);
		List<Integer> r_lost = new ArrayList<>();
		List<Integer> r_reserve = new ArrayList<>();

		for(int l : lost){

			boolean isAlso = false;
			for(int i = 0; i < reserve.length; i++){
				if(reserve[i] == l){
					reserve[i] = -1;
					isAlso = true;
					break;

				}
			}
			if(!isAlso)r_lost.add(l);
		}
		for(int i = 0; i < reserve.length; i++){
			if(reserve[i] != -1){
				r_reserve.add(reserve[i]);
			}
		}
		for(int r : r_reserve){
			if(r_lost.contains(r-1)){
				r_lost.remove((Integer)(r-1));
			} else if(r_lost.contains(r+1)){
				r_lost.remove((Integer)(r+1));
			}

		}

		return n-r_lost.size();
	}
}
