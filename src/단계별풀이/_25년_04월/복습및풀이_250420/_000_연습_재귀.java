package 단계별풀이._25년_04월.복습및풀이_250420;

public class _000_연습_재귀 {
	public static void main(String[] args) {
		sum(new int[]{1,2,3,4,5},0);
		reverse(new int[]{1,2,3,4,5},0);
	}
	// 배열의 합
	static int sum(int[] arr, int idx){

		if(idx == arr.length){
			return 0;
		}
		return arr[idx]+sum(arr, idx+1);
	}
	// 배열 뒤집기
	static void reverse(int[] arr, int idx){

		if(idx == arr.length){
			return;
		}
		reverse(arr,idx+1);
		System.out.println(arr[idx]);
	}
}
