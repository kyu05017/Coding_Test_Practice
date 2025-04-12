package 단계별풀이.연습.완전탐색_그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _001_02_체육복_복습 {
	public static void main(String[] args) {
		System.out.println(solution(5, new int[]{2,4}, new int[]{3}));
	}

	private static int solution(int n, int[] lost, int[] reserve){
		int answer = 0;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		List<Integer> real_lost = new ArrayList<>();
		List<Integer> real_reserve = new ArrayList<>();

		for(int l : lost){
			boolean isAlso = false;
			for(int i = 0; i < reserve.length; i++){
				if(l==reserve[i]){
					reserve[i] = -1;
					isAlso = true;
					break;
				}
			}
			if(!isAlso)real_lost.add(l);
		}

		for(int i : reserve){
			if(i != -1){
				real_reserve.add(i);
			}
		}
		/** 스트림 버전
		real_reserve = Arrays.stream(reserve)
				.filter(r -> r != -1)
				.boxed()
				.collect(Collectors.toList());
		*/
		System.out.println("진짜 도둑 맞은 놈들 : " + real_lost.toString());
		System.out.println("진짜 옷 입을 놈들 : " + real_reserve.toString());

		for(int i : real_reserve){
			if(real_lost.contains( i - 1 )){
				real_lost.remove((Integer) (i - 1));
			} else if(real_lost.contains( i + 1 )){
				real_lost.remove((Integer) (i + 1));
			}
		}

		return n - real_lost.size();
	}
}
