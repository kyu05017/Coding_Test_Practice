package old.단계별풀이_old._25년_04월.복습및풀이_250416;

import java.util.Arrays;

public class _004_심화응용_정렬And투포인터 {


	// 타겟 보다 작은 수의 카운트 내 코드
	public static void main(String[] args) {

	}
	private static void re_factory() {
		/***
		 * 요구:
		 *    i < j를 만족하면서
		 *    nums[i] + nums[j] < target인 쌍의 수를 세는 것
		 *    쌍의 목록은 필요 없고, 총 몇 개인지만 리턴
		 */
		int[] nums = {3, 5, 1, 2, 4};
		int target = 7;

		int i = 0;
		int j = nums.length - 1;
		int cnt = 0;

		Arrays.sort(nums);

		while(i < j){
			int sum = nums[i] + nums[j];
			if (sum < target) {
				cnt += (j - i);
				i++;
			} else {
				j--;
			}
		}
	}
	private static void myCode() {
		/***
		 * 요구:
		 *    i < j를 만족하면서
		 *    nums[i] + nums[j] < target인 쌍의 수를 세는 것
		 *    쌍의 목록은 필요 없고, 총 몇 개인지만 리턴
		 */

		int[] nums = {3, 5, 1, 2, 4};
		int target = 7;

		int i = 0;
		int j = nums.length - 1;
		int cnt = 0;

		Arrays.sort(nums);

		while (i < j) {

			int sum = nums[i] + nums[j];

			if (sum < target) {
				for (int k = j; k > i; k--) {
					cnt++;
				}
				i++;
			} else {
				j--;
			}
		}
		System.out.println("총 " + cnt + "쌍 -> 정답: " + cnt);
	}
}
