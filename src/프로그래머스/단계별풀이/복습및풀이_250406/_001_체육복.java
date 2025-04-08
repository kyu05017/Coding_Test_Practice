package 프로그래머스.단계별풀이.복습및풀이_250406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _001_체육복 {
	public static void main(String[] args) {

	}
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		Arrays.sort(lost);
		Arrays.sort(reserve);

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
}
