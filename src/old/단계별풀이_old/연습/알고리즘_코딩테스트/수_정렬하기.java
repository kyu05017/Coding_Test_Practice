package old.단계별풀이_old.연습.알고리즘_코딩테스트;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@SuppressWarnings("all")
public class 수_정렬하기 {

	/**
	 * 수 정렬하기
	 *
	 * @문제
	 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	 *
	 * @입력
	 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
	 * @출력
	 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[] a = new int[n];

//		Arrays.sort();

		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = a.length-1; i > 0; i--) {
			for (int j = i; j < i; j++) {
				if (a[j + 1] < a[j]) {
					int tmp = a[j + 1];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}

		for(int z : a){
			System.out.println(z);
		}

	}
}
