package 단계별풀이_old.연습.완전탐색_그리디;

public class _004_조이스틱_Lv2_그리디_심화_연습 {
	///  성공
	public static void main(String[] args) {
		System.out.println(solution("JAAAANZ"));
//		solution2("ZAZZA");
	}
	public static int solution(String name) {
		int answer = 0;

		// 받은 문자열 확인
		System.out.println("받은 문자열 : " + name);

		// 상하이동
		// 문자 하나하나를 A로 바꾸는 데 드는 최소 횟수만 구현
		for(int i = 0; i < name.length(); i++){

			char c = name.charAt(i);
			System.out.println("name.charAt("+i+") : "+c);

			int up = c - 'A';
			System.out.println("up[c - 'A']{A 까지의 거리} : " + up);

			int down = 'Z' - c + 1;
			System.out.println("down[c - 'A']{A 까지의 거리} : "+down);

			int add = Math.min(up,down);
			System.out.print((add == up)?"A 까지 거리 : ":"Z 까지 거리 : ");
			System.out.print(add+"\n");

			answer += add;
			System.out.println();
		}
		System.out.println("상하이동 결과 : "+answer);


		//좌우이동
		// 포인트가 오른쪽으로만 이동하는 경우 수 체크 (문자열의 길이 -1 ) 총
		int minMove = name.length()-1;
		System.out.println("최단 이동경로 : "+ minMove);

		for(int i = 0; i < name.length(); i++){

			// 다음 인덱스 저장
			int next = i + 1;

			// 문자열에서 A가 연속되는 구간의 끝(next) 찾기
			// 이동이 없는 구간은 조작할 필요 없이 skip
			while(next < name.length() && name.charAt(next) == 'A'){
				next++;
			}

			// i까지 오른쪽으로 이동 -> A 구간 skip 후 <- 뒤에서 돌아오는 경우
			// i : 지금까지 직진한 거리
			// name.length() : 남은 거리
			// Math.min(i, len - next) : 어느 방향으로 돌아갈지 최단 거리 선택
			int caseMove = i + name.length() - next + Math.min(i, name.length() - next);
			// caseMOve = 이동한 거리 + 남은거리 - 스킵할 구간 + 최단 경로
			System.out.println("--------------------------------------");
			System.out.println("i : 현재위치 : "+ i);
			System.out.println("name.length() : 남은거리 : "+ name.length());
			System.out.println("next : 스킵할 구간 : "+ next);
			System.out.println("Math.min(i, name.length() - next) : 이동한 거리와 전체 길이에서 스킵할 구간을 뺀 수 중 가장 작은 거리 : "+ Math.min(i, name.length() - next));
			System.out.println("i + name.length() - next + Math.min(i, name.length() - next) : "+ caseMove);
			System.out.println("--------------------------------------");

			minMove = Math.min(caseMove,minMove);
		}
		answer += minMove;

		return answer;
	}

	// 상하 이동 복슥
	static void solution2(String name){

		System.out.println("받은 문자열 :"+name);
		int answer = 0;
		for(int i = 0; i < name.length();i++){
			int c = name.charAt(i);

			System.out.println(c);

			int up = c - 'A';
			int down = 'Z' - c + 1;

			int min = Math.min(up,down);
			System.out.println("최단 거리 : "+min);
			answer += min;
		}

		System.out.println(answer);
	}
}
