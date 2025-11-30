package 단계별풀이_old.연습.알고리즘_코딩테스트;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제 18번
 *   인하은행에는 ATM이 1대밖에 없다. 지금 이 ATM앞에 N명의 사람들이 줄을 서 있다.
 *  사람은 1번에서 N번까지 번호가 매겨져 있으며, i번 사람이 돈을 인출하는 데 걸리는 시간은 P분이다.
 *
 *   사람들이 줄을 서는 순서에 따라서 돈을 인출하는 데 필요한 시간의 합이 달라진다.
 *  예를 들어 총 5명ㅇ이 있고, p1=3, p2=1, p3=4, p4=3, p5=2 일 때를 생각해보자 [1,2,3,4,5] 순서로 줄을 선다면,
 *  1번 사람은 3분, 2번사람은 1번 사람이 돈을 뽀을 때깢비 기다려야 하므로 3+1+4ㄴ=8분이 걸린다.
 *  4번 사람은 3+1+4+3 = 11분, 즉 각 사람이 돈을 인출하는 데 필요한 시간의 합은 3+4+8+11+13=39분이다.
 *
 *   줄을 서 있는 사람의 수 N과 각 사람이 돈을 인출하는 데 걸리는 시간 P가 주어졌을 때,
 *  각 사람이 돈을 인출하는 데 필요한 시간의 합의 최ㅔ솟값을 구하는 프로그램을 작성하세요.
 *
 * 입력
 *  1번째 줄에는 사람의 수 N( 1 <= N <= 1,000 ),
 *  2번째 줄에는 각 사람들이 돈을 인출하는데 걸리는 시간 P( 1 <= P <= 1,000 )
 */

public class ATM_인출시간_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++){
			p[i] = sc.nextInt();
		}
		 */

		// 사람의 수
		int n = 5;
		// 걸리는 시간
		int[] p = {3,1,4,3,2};
		// 합 배열 저장 배열
		int[] s = new int[n];

		// 1~n 까지 반복하면서
		for(int i=1;i<n;i++){
			
			int insert_point = i;
			int insert_value = p[i];

			for(int j=i-1; j >= 0; j--){
				if(p[j] < p[i]){
					insert_point = j+1;
					break;
				}
				if(j == 0){
					insert_point = 0;
				}
			}
			for(int j=i; j > insert_point; j--){
				p[j] = p[j-1];
			}
			p[insert_point] = insert_value;
		}
		s[0] = p[0];

		for(int i = 1; i < n; i++){
			s[i] = s[i-1]+p[i];
		}

		int sum = Arrays.stream(s).sum();

		System.out.println(n);
		System.out.println(Arrays.toString(p));
		System.out.println(sum);
	}
}
