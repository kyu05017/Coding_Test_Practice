package 단계별풀이._25년_04월.복습및풀이_250428._01_시간복잡도;

import java.util.Arrays;

public class _002_01_시간복잡도_활용하기 {
	public static void main(String[] args) {

		/**
		 *  제한 조건 : 2초 -> 최대 연산 횟수 2억회
		 *  연산 횟수 - 알고리즘 시간 복잡도 X 데이터 크기
		 *
		 *  데이터 최대 크기 : 1,000,000 (백만)
		 *
		 *  버블 정렬 : 1,000,000^2 => 1,000,000,000,000 > 200,000,000 => 부적합
		 *  병합 정렬 : 1,000,000log(1,000,000) => 약 20,000,000 < 200,000,000 => 적합
		 */

		/*
		Scanner sc = new Scanner(System.in);

		int task = sc.nextInt();

		int[] arr = new int[task];

		for(int i = 0; i < arr.length; i++){
			int arr_num = sc.nextInt();
			arr[i] = arr_num;
		}
		 */
		int[] arr = new int[]{5, 2, 3, 4, 1};

		// 버블 정렬
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				int temp = arr[i];
				if(temp > arr[j]){
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		timeN();
	}

	/// 연속 횟수가 N인 경우
	private static void timeN(){

		// 10만
		int n = 100000;

		int cnt = 0;
		for(int i = 0; i < n; i++){
			System.out.println(cnt++);
		}
	}
	/// 위 코드와 연산 횟수는 3배 차이가 나지만, 상수는 무시 함으로 O(n) 으로 시간 복잡도는 같다.
	private static void three_time(){
		// 10만
		int n = 100000;

		int cnt = 0;
		for(int i = 0; i < n; i++){
			System.out.println(cnt++);
		}
		for(int i = 0; i < n; i++){
			System.out.println(cnt++);
		}
		for(int i = 0; i < n; i++){
			System.out.println(cnt++);
		}
	}
	///  시간 복잡도는 가장 많이 중첩된 반복문을 기준으로 도출한다.
	private static void squareTime(){
		// 10만
		int n = 100000;
		int cnt = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.println(cnt++);
			}
		}
	}
}
