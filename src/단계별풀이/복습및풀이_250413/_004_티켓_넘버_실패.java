package 단계별풀이.복습및풀이_250413;

public class _004_티켓_넘버_실패 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{4, 1, 2, 1},4));
	}
	// 디버깅 용 -> 나는 못품
	private static int solution(int[] numberes, int target){
		return dfs(numberes,target,0,0);
	}
	private static int dfs(int[] numbers, int target, int depth, int sum) {
		System.out.println("------------------------------------------------------------");
		// 디버깅 로그
		System.out.println("재귀 시작 depth: " + depth + ", sum: " + sum);
		// 종료 조건: 모든 숫자를 다 사용했을 때
		if (depth == numbers.length) {
			System.out.println("    깊이 depth("+depth+")이 배열길이 numbers.length("+numbers.length+")과 같음");
			if (sum == target) {
				System.out.println("        🎯 target 도달! : sum("+sum+")이 target("+target+")과 같음");
				System.out.println("        return 1");
				System.out.println("        ----------------------------------------------------");
				return 1;
			} else {
				System.out.println("        sum("+sum+")이 target("+target+")과 다름");
				System.out.println("        return 0");
				System.out.println("        ----------------------------------------------------");
				return 0;
			}
		} else {
			System.out.println("    깊이 depth("+depth+")이 배열길이 numbers.length("+numbers.length+")과 다름");
		}
		System.out.println("add 재귀 실행 : target("+target+"), depth+1("+(depth+1)+"), sum("+sum+") + numbers[depth("+depth+")]("+numbers[depth]+") = sum("+(sum + numbers[depth])+")");
		// 재귀 호출: +와 - 두 가지 경우로 분기
		int add = dfs(numbers, target, depth + 1, sum + numbers[depth]);
		System.out.println("add 재귀 종료 : depth("+depth+"), add("+add+")");


		System.out.println("subtract 재귀 실행 : target("+target+"), depth+1("+(depth+1)+"), sum("+sum+") - numbers[depth("+depth+")]("+numbers[depth]+") = sum("+(sum - numbers[depth])+")");
		int subtract = dfs(numbers, target, depth + 1, sum - numbers[depth]);
		System.out.println("subtract 재귀 종료 : depth("+depth+"), subtract("+subtract+")");

		System.out.println("재귀 종료 depth: " + depth + ", sum: " + sum);
		System.out.println("add("+add+") + subtract("+subtract+")");
		System.out.println("return ("+(add+subtract)+")");
		System.out.println("------------------------------------------------------------");
		return add + subtract;
	}
}
