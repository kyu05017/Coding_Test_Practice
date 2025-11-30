package old.단계별풀이_old.연습.Lv0.머쓱이보다_키_큰_사람;

import java.util.Arrays;

/**
 *  문제 설명
 *
 *  머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
 *  머쓱이네 반 친구들의 키가 담긴 정수 배열 [array]와 머쓱이의 키 [height]가 매개변수로 주어질 때,
 *  머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 */
public class 머쓱이보다_키_큰_사람 {
	public static int solution(int[] a, int n) {

		// for문 풀이
		int answer1 = 0;
		for(int j : a) {
			answer1 += ( j > n )?1:0;
		}

		// stream 풀이
		long answer2 = Arrays.stream(a).filter(e->e>n).count();
		/*
		1. 컬렉션       Arrays.stream( int[] a )
		2. 중간 연산자   filter( 람다 조건문 )
		3. 최종 연산자   count(); 횟수 long 반환
		 */
		return answer1;
	}
}

