package 프로그래머스.단계별풀이.완전탐색_그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _001_체육복 {
	public static void main(String[] args) {
		System.out.println(solution(5, new int[]{2,4}, new int[]{1, 2, 3}));
	}

	// 풀이 실패
	public static int solution2(int n, int[] lost, int[] reserve) {
		int answer = 0;


		List<Integer> real_reserve = Arrays.stream(reserve).boxed().collect(Collectors.toList());
		List<Integer> real_lost =  Arrays.stream(lost).boxed().collect(Collectors.toList());

		// 여벌의 체육복을 가져온 학생이 도난맞은 경우 제외
		for(int i = 0; i < real_reserve.size(); i++){
			if(real_lost.contains(real_reserve.get(i))){
				real_reserve.remove(i);
			}
		}
		int lost_cnt = 0;
		for(int i = 0; i < real_reserve.size(); i++){
			if(real_lost.contains(real_reserve.get(i)-1)){
				lost_cnt++;
			} else if(real_lost.contains(real_reserve.get(i)+1)){
				lost_cnt++;
			}
		}

		System.out.println("lost_cnt : "+lost_cnt);

		return answer;
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);

		// 여벌 있지만 도난당한 사람 먼저 제거
		List<Integer> realLost = new ArrayList<>();
		List<Integer> realReserve = new ArrayList<>();

		for (int l : lost) {
			boolean isAlsoReserve = false;
			for (int i = 0; i < reserve.length; i++) {
				if (l == reserve[i]) {
					reserve[i] = -1; // 사용했으므로 제거 처리
					isAlsoReserve = true;
					break;
				}
			}
			if (!isAlsoReserve) realLost.add(l);
		}

		System.out.println(Arrays.toString(reserve));


		System.out.println(realLost.toString());
		for (int r : reserve) {
			if (r != -1) realReserve.add(r);
		}

		System.out.println(realReserve.toString());

		// 빌려주기 시도
		for (int r : realReserve) {
			if (realLost.contains(r - 1)) {
				realLost.remove((Integer) (r - 1));
			} else if (realLost.contains(r + 1)) {
				realLost.remove((Integer) (r + 1));
			}
		}

		return n - realLost.size();
	}
}