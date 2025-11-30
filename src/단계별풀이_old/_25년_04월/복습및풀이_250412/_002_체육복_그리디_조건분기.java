package 단계별풀이_old._25년_04월.복습및풀이_250412;

import java.util.*;
import java.util.stream.Collectors;

public class _002_체육복_그리디_조건분기 {
	public static void main(String[] args) {
		System.out.println(solution(5, new int[]{2,4}, new int[]{1, 2, 3}));
	}

	// list 방식
	private static int solution2(int n, int[] lost, int[] reserve){
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
			if(!isAlso) r_lost.add(l);
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

	// set 방식
	private static int solution1(int n, int[] lost, int[] reserve){
		Arrays.sort(lost);
		Arrays.sort(reserve);

		Set<Integer> lostSet  = new HashSet<>();
		Set<Integer> reserveSet  = new HashSet<>();

		// 초기화
		for (int l : lost) lostSet.add(l);
		for (int r : reserve) reserveSet.add(r);

		// 1. 여벌도 있고 도난도 당한 학생 제거
		Set<Integer> intersection = new HashSet<>(lostSet);

		// 도난 당한 학색 [2,4]와 여벌 옷의 친구 [1,2,4]의 도난당한 학생 기준으로 교집합
		intersection.retainAll(reserveSet); // 교집합

		lostSet.removeAll(intersection);
		reserveSet.removeAll(intersection);

		// 2. 여벌 가진 학생이 앞/뒤 번호 학생에게 빌려주기
		for (int r : reserveSet) {
			if (lostSet.contains(r - 1)) {
				lostSet.remove(r - 1);
			} else if (lostSet.contains(r + 1)) {
				lostSet.remove(r + 1);
			}
		}
		// 3. 전체 학생 수 - 체육복 못 입는 학생 수
		return n - lostSet.size();
	}

	// 스트림 추가
	private static int solution(int n, int[] lost, int[] reserve){

		Arrays.sort(lost);
		Arrays.sort(reserve);

		Set<Integer> lostSet = Arrays.stream(lost).boxed().collect(Collectors.toSet());
		Set<Integer> reserveSet = Arrays.stream(reserve).boxed().collect(Collectors.toSet());

		Set<Integer> also = new HashSet<>(lostSet);
		also.retainAll(reserveSet);

		lostSet.removeAll(also);
		reserveSet.removeAll(also);

		for (int r : reserveSet) {
			if (lostSet.contains(r - 1)) {
				lostSet.remove(r - 1);
			} else if (lostSet.contains(r + 1)) {
				lostSet.remove(r + 1);
			}
		}

		return n - lostSet.size();
	}
}
