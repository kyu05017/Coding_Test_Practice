package 단계별풀이_old.연습.Lv0.배열_뒤집기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 배열_뒤집기 {
	public static void main(String[] args){
		System.out.println(Arrays.toString(sol(new int[]{1, 0, 1, 1, 1, 3, 5})));
	}

	private static int[] sol(int[] num_list){
		return Arrays.stream(num_list).boxed().collect(Collectors.toList()).reversed().stream().mapToInt(Integer::intValue).toArray();
	}
}
