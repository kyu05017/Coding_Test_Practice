package old.단계별풀이_old.연습.Lv0.최빈값_구하기;

import java.util.*;

public class 최빈값_구하기 {

	public static int solution(int[] a) {
		int answer = 0;
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int count  = 0;
		for(int j : a) {
			map.put(j, map.getOrDefault(j, 0) + 1);
		}
		map.forEach((k,v) ->{
			list.add(v);
		});

		list.forEach(e->{
			out(e+"");
		});
		
		return answer;
	}

	public static void main(String[] args) {
		solution(new int[]{1,2,3,3,3,4});
	}
	public static void out(String str){
		System.out.println(str);
	}
}
