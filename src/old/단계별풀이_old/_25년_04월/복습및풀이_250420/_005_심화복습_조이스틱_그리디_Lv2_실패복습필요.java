package old.단계별풀이_old._25년_04월.복습및풀이_250420;

public class _005_심화복습_조이스틱_그리디_Lv2_실패복습필요 {
	public static void main(String[] args) {
		System.out.println(solution("ABAAAAAAAAABB"));
	}

	public static int solution(String name) {
		int answer = 0;

		// 알파벳 상하 이동 처리
		for(char c : name.toCharArray()){ //문자열을 아스키코드로 변환
			answer += Math.min((c - 'A'),26 - (c - 'A'));
		}
		System.out.println("상하이동 완료 : "+answer + "\n");
		// 좌우 이동
		// move는 이동할 수 있는 최대 EX: JEROEN -> [ 0 ~ 5 ]
		int move = name.length() - 1;

		// i는 0부터 name의 길이 까지만 반복하며
		for(int i = 0; i < name.length(); i++){
			// 	다음 문자 중 'A' 아닌 첫 위치
			int next  = i + 1;

			// A 인것들은 스킵
			while(next < name.length() && name.charAt(next)=='A'){
				System.out.println("    스킵추가");
				next++;
			}

			System.out.println("    스킵할 문자길이 : "+next);
			// 바로옆 A를 제외한 다른문자들의 길이
			int temp = i + name.length() - next;
			System.out.println("바로옆 A를 제외한 다른문자들의 길이 : "+temp);

			int min =  Math.min(i, name.length() - next);
			System.out.println("min : "+min);
			int case1 = temp+min;
			System.out.println("case : "+case1);

			move = Math.min(move, case1);
			System.out.println("move : "+move);
		}

		return answer+move;
	}

}
