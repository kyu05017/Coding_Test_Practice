package 단계별풀이_old.연습.Lv0.배열_두배_만들기;

import java.util.Arrays;

/**
 *
 *  문제 설명
 *      정수 배열 numbers가 매개변수로 주어집니다.
 *      numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 *
 */
public class 배열_두배_만들기 {

	// for 문 풀이
	public int[] solution(int[] a ) {
		for(int i=0;i<a.length;i++){
			a[i]=a[i]*2;
		}
		return a;
	}

	// stream 풀이
	public static int[] solution2(int[] a){
		return Arrays.stream(a).map(e -> e * 2).toArray();
	}

}
