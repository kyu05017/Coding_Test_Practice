package 단계별풀이._25년_04월.복습및풀이_250418;

public class _005_실전_타겟_넘버_Lv2_내일재도전 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,1,1,1,1},3));
	}

	private static int solution(int[] numbers, int target){
		return dfs("start", numbers, target, 0, 0,0); // 초기: index = 0, sum = 0
	}

	private static int dfs(String task, int[] numbers, int target, int index, int sum, int depth) {
		// 들여쓰기용 prefix
		String prefix = "    ".repeat(depth);
		String endfix = "\n";
		System.out.println(prefix + " 현재 상황 : "+ task + endfix);
		System.out.println(prefix + "→ DFS(index=" + index + ", sum=" + sum + ")" + endfix);

		// 종료 조건: 모든 숫자를 사용한 경우
		if (index == numbers.length) {
			if (sum == target) {
				System.out.println(prefix + "✔ target 도달! sum=" + sum + endfix);
				return 1;
			} else {
				System.out.println(prefix + "✘ 실패! sum=" + sum + endfix);
				return 0;
			}
		} else {
			System.out.println(prefix + "index가 길이에 미충족 길이="+numbers.length+" index="+index + endfix);
		}

		int current = numbers[index];
		System.out.println(prefix + "숫자 선택: " + current + " → [+] or [-]" + endfix);

		// 다음 단계로 +, - 두 방향 시도
		int plus = dfs("plus",numbers, target, index + 1, sum + current, depth + 1);
		int minus = dfs("minus",numbers, target, index + 1, sum - current, depth + 1);

		int result = plus + minus;

		System.out.println(prefix + "← DFS(index=" + index + ") 종료 → 가능한 경우 수: " + result + endfix);
		return result;
	}
}
