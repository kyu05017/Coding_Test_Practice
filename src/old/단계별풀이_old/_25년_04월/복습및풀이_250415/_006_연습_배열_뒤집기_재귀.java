package old.단계별풀이_old._25년_04월.복습및풀이_250415;

public class _006_연습_배열_뒤집기_재귀 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.print("역순 출력: ");
		reversePrint(arr, 0);
	}

	private static void reversePrint(int[] arr, int idx) {
		if (idx == arr.length) return;
		reversePrint(arr, idx + 1);
		System.out.print(arr[idx] + " ");
	}
}
