package 단계별풀이_old._25년_05월.복습및풀이_250503._02_자료구조;

import java.util.Scanner;

public class _02_000_평균구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for(int i = 0 ; i < N; i++){
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		System.out.println(sum);

		System.out.println((double)(sum/N));
	}
}
