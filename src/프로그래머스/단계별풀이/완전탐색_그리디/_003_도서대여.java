package 프로그래머스.단계별풀이.완전탐색_그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _003_도서대여 {
	public static void main(String[] args) {
		System.out.println(solution(5, new int[]{2,4}, new int[]{1,2,3}));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		// 배열 정렬
		Arrays.sort(lost);
		Arrays.sort(reserve);

		// 여분이 있고 도난도 당한 학생 제거
		List<Integer> realLost = new ArrayList<>();
		List<Integer> alsoLost = new ArrayList<>();
		List<Integer> realReserve = new ArrayList<>();

		for(int i : lost){
			for(int j = 0; j < reserve.length; j++) {
				if(i == reserve[j]){
					reserve[j] = -1;
					// 여벌을 가져왔지만 도둑맞은 사람
					alsoLost.add(i);
					break;
				}
			}
		}

		// 진짜 빌려줄 수 있는 사람
		for(int i = 0; i < reserve.length; i++){
			if(reserve[i] != -1){
				realReserve.add(reserve[i]);
			}
		}

		// 진짜 도둑 맞은 사람
		for(int i = 0; i < lost.length; i++){
			for(int j : alsoLost){
				if (lost[i] == j) {
					lost[i] = -1;
					break;
				}
			}
		}
		for (int j : lost) {
			if (j != -1) {
				realLost.add(j);
			}
		}

		for(int i : realReserve){
			if(realLost.contains(i-1)){
				realLost.remove((Integer) (i- 1));
			}
			if(realLost.contains(i+1)){
				realLost.remove((Integer) (i+ 1));
			}
		}

		return n-realLost.size();
	}
}
