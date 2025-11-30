package old.단계별풀이_old.연습.완전탐색_그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _003_도서대여_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution2(5, new int[]{2,4}, new int[]{1,3,5}));
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
	// 리팩토링 코드
	private static int solution2(int n, int[] lost, int[] reserve){
		int answer = 0;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		List<Integer> realLost = new ArrayList<>();
		List<Integer> realReserve = new ArrayList<>();

		for(int l : lost){
			boolean hasSpare = false;
			for(int i = 0; i < reserve.length; i++){
				if(l == reserve[i]){
					reserve[i] = -1;
					hasSpare = true;
					break;
				}
			}
			if(!hasSpare)realLost.add(l);
		}

		for(int i : reserve){
			if(i != -1){
				realReserve.add(i);
			}
		}

		System.out.println("진짜 도둑 맞은 놈들 : " + realLost.toString());
		System.out.println("진짜 옷 입을 놈들 : " + realReserve.toString());

		for(int i : realReserve){
			if(realLost.contains(i-1)){
				realLost.remove((Integer)(i-1));
			} else if(realLost.contains(i+1)){
				realLost.remove((Integer)(i+1));
			}
		}

		System.out.println("못입는 놈들 : "+realLost.toString());

		return n - realLost.size();
	}
}
