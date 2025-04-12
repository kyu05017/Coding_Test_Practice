package 단계별풀이.연습.완전탐색_그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _001_001_체육복_복습 {
	public static void main(String[] args) {
		System.out.println(solution(5,new int[]{1, 2, 3, 4, 5, 6},new int[]{1, 2, 3}));
	}

	// 싪패
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		// 전체 학생 수 5
		// 잃어버린 친구 2,4
		// 여벌가져온 친구 1,3,5

		// 주의 : 여벌 체육복을 가져온 학생이 도난 당했을 경우 자기 자신 밖에 입지못함

		List<Integer> real_lost = new ArrayList<>();
		List<Integer> real_reserve = new ArrayList<>();
		int[] temp_reserve = new int[reserve.length];
		for(int t = 0; t < reserve.length;t++){
			temp_reserve[t] = reserve[t];
		}

		// 실제로 여벌을 가지고 있는 사람
		for(int l : lost){
			for(int i = 0; i < reserve.length; i++){
				if(l == reserve[i]){
					reserve[i] = -1;
				}
			}
		}
		for(int i : reserve){
			if(i != -1){
				real_reserve.add(i);
			}
		}

		// 실제로 도난 당한 사람
		for(int r : temp_reserve){
			for(int i = 0; i < lost.length; i++){
				if(r == lost[i]){
					lost[i] = -1;
				}
			}
		}
		for(int i : lost){
			if(i != -1){
				real_lost.add(i);
			}
		}

		// 여벌을 가진 친구들이 빌려주려고 한다.
		for(int r : real_reserve){
			// 앞 번호 학생이 도난 당했을 경우
			if(real_lost.contains(r-1)){
				real_lost.remove((Integer)(r-1));
				// 뒷 번호 학생이 도난 당했을 경우
			} else if(real_lost.contains(r+1)){
				real_lost.remove((Integer)(r+1));
			}
		}

		return n - real_lost.size();
	}
	public static int solution2(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);

		List<Integer> realLost = new ArrayList<>();
		List<Integer> realReserve = new ArrayList<>();

// 1. 여벌이 있는데 도난당한 경우 제거
		for (int l : lost) {
			boolean alsoReserve = false;
			for (int i = 0; i < reserve.length; i++) {
				if (l == reserve[i]) {
					reserve[i] = -1;
					alsoReserve = true;
					break;
				}
			}
			if (!alsoReserve) {
				realLost.add(l);
			}
		}

// 2. 여벌만 가지고 있는 사람 정리
		for (int r : reserve) {
			if (r != -1) realReserve.add(r);
		}

// 3. 빌려주기
		for (int r : realReserve) {
			if (realLost.contains(r - 1)) {
				realLost.remove((Integer) (r - 1));
			} else if (realLost.contains(r + 1)) {
				realLost.remove((Integer) (r + 1));
			}
		}

		return n - realLost.size();
	}

	private static int sol(int n, int[] lost, int[] reserve){
		int answer = 0;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		for(int l : lost){

		}

		return answer;
	}
}
