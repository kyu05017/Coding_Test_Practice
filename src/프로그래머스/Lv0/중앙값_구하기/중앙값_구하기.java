package 프로그래머스.Lv0.중앙값_구하기;

import java.util.Arrays;

/**
 *
 * 문제 설명
 *  중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
 *  예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
 *  정수 배열 array가 매개변수로 주어질 때,
 *  중앙값을 return 하도록 solution 함수를 완성해보세요.
 *
 */
public class 중앙값_구하기 {

	public int solution(int[] a){
		Arrays.sort(a);
		return a[a.length/2];
	}
}
