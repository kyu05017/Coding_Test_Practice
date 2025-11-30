package 단계별풀이_old._25년_04월.복습및풀이_250428._01_시간복잡도;

import java.util.Arrays;
import java.util.Scanner;

public class _003_01_수_정렬하기_백준2750 {
	public static void main(String[] args) {

		/// 선택정렬
		//solution001();

		/// Arrays.sort
		//solution002();

		/// 카운팅 정렬
		solution003();

	}
	/// 선택 정렬
	private static void solution001(){

		int[] arr = makeArray();

		// 선택 정렬
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	///  Arrays.sort
	private static void solution002(){
		int[] arr = makeArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/// 카운팅 정렬
	private static void solution003(){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean[] tempArr = new boolean[2001];

		for(int i = 0; i < N; i++){
			tempArr[sc.nextInt() + 1000] = true;
		}

		for(int i = 0; i < tempArr.length; i++){
			if(tempArr[i]){
				System.out.print((i-1000) +",");
			}
		}
	}

	// 배열 만들기
	private static int[] makeArray(){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for(int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
