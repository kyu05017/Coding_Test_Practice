package old.단계별풀이_old._25년_05월.복습및풀이_250503._03_누적합;

public class _003_입문_덧칠하기 {
	public static void main(String[] args) {
		// 예시 입력
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};

		System.out.println(solution(n, m, section));
	}

	public static int solution(int n, int m, int[] section) {
		int answer = 0;

		int paintedUntil = 0;  // 마지막으로 칠한 위치까지 저장

		for (int i = 0; i < section.length; i++) {
			int pos = section[i];

			// 현재 구간이 아직 칠해지지 않았다면
			if (pos > paintedUntil) {
				paintedUntil = pos + m - 1;  // 새로 칠함
				answer++;  // 횟수 증가
			}
		}

		return answer;
	}
}
