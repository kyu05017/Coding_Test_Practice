package 단계별풀이.복습및풀이_250413;

public class _006_숫자_배열의_합_재귀버전 {
	public static void main(String[] args) {
		System.out.println(sum(new int[]{1,2,3,4,5},0));
	}

	private static int sum(int[] arr, int idx){

		// 기저 조건
		if(idx == arr.length) return 0;

		return arr[idx] + sum(arr,idx+1);
	}
}
