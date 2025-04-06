package 프로그래머스.단계별풀이.완전탐색_그리디;

import java.util.ArrayList;
import java.util.List;

public class _007_1_투포인터_연습 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int target = 6;

		int left = 0;
		int right = arr.length-1;

		List<String> list = new ArrayList<>();

		System.out.println(" left : "+left);
		System.out.println(" right : "+right);

		while(left < right){
			System.out.println("---------------------------------------------");
			int sum = arr[left] + arr[right];

			System.out.println(" (arr[left] : "+ arr[left]  +") + (arr[right] : "+arr[right]+") = (sum : "+sum +") "+ ( (sum < target)? " < ": " >= " )+"target : "+ target);
			System.out.println();

			if(sum < target){
				System.out.println("    sum 이 target 보다 작다");
				StringBuilder sb = new StringBuilder();
				sb.append("{").append(arr[left]).append(",").append(arr[right]).append("}");

				list.add(sb.toString());
				System.out.println("    left 증가");
				left++;
			} else {
				System.out.println("    sum 이 target 보다 크거나 같다");
				System.out.println("    right 감소");
				right--;
			}



			System.out.println("\n    left : "+left);
			System.out.println("    right : "+right);

			System.out.println("두 수의 합이 target 보다 작은 경우의 쌍 : "+list.toString());
			System.out.println("---------------------------------------------");
		}
	}
	
}
