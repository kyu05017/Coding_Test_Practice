package 단계별풀이.연습.완전탐색_그리디;

import java.util.ArrayList;
import java.util.List;

public class _004_조이스틱_Lv2_그리디_심화_실패 {


	///  실패
	public static void main(String[] args) {
		System.out.println(solution("JAN"));
	}
	public static int solution(String name) {
		int answer = 0;
		int len = name.length();

		// 1. 각 알파벳을 A로 바꾸는 최소 횟수 계산
		for (int i = 0; i < len; i++) {
			char c = name.charAt(i);
			int move = Math.min(c - 'A', 'Z' - c + 1);
			System.out.println("문자: " + c + " → 상하 이동: " + move);
			answer += move;
		}

		// 2. 커서 이동 횟수 최소값 계산
		int minMove = len - 1; // 초기값: 쭉 오른쪽으로 가는 경우
		System.out.println("\n기본 커서 이동: " + minMove);

		for (int i = 0; i < len; i++) {
			int next = i + 1;
			while (next < len && name.charAt(next) == 'A') {
				next++;
			}

			int caseMove = i + len - next + Math.min(i, len - next);
			System.out.println("i: " + i + ", next: " + next + ", caseMove: " + caseMove);

			minMove = Math.min(minMove, caseMove);
		}

		System.out.println("최소 커서 이동: " + minMove);
		answer += minMove;
		return answer;
	}

	private static int solution2(String name){
		int answer = 0;

		// 디버그용
		String[] temp_a = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		// 알파벳,현재위치,움직인값 선언

		// A와 가까운지 Z와 가까운지 비교

		// A와 가깝다

		// 그러면서 A에서는 멀지만 현재위치에서 가까운 경우는 ◀
		// 그러면서 현재위치가 A보다는 가까울경우 위치 이동

		// Z와 가깝다.
		// 그러면서 A에서는 멀지만 현재위치에서 가까운 경우는 ▶
		// 그러면서 현재위치가 A보다는 가까울경우 위치 이동

		// 이동된 모든 수를 더한 값 반환

		// 일단 받은 문자열을 숫자에 비교하여 변환


		char[] temp = name.toCharArray();
		List<Integer> list = new ArrayList<>();
		for (char c : temp) {
			list.add(Integer.parseInt(String.valueOf(c - 65)));
		}
		int now_location = 0;
		for(int i = 0; i < list.size(); i++){

			int now = list.get(i);
			int move = 0;
			if(now == 0){ // 원하는 위치가 A면 ◀ 끝
				now_location++;
			} else if(now == 25) { // 원하는 위치가 Z면 ▶ 끝
				now_location++;
			} else if(now_location != now){
				//A - M
				if(now < 13){ // 알파벳의 중간보다 작은경우
					if(now > 6.5){ // 현재 위치에 가가운 경우
						move = now_location-now;
						now_location += (move < 0)? move*-1 : move;
					} else { // A 에 가까운경우
						now_location++; // 커서를 왼쪽으로 이동
						now_location += now;
					}
				} else {// N - Z
					if(now < 19.5){ // 현재 위치에 가가운 경우
						move = now_location-now;
						now_location += (move < 0)? move*-1 : move;
					} else { // Z 에 가까운경우
						now_location++; // 커서를 오른쪽으로 이동
						now_location += (25 - now);
					}
				}
			}
		}


		return now_location;
	}

	private static int sol2(String name){
		int answer = 0; // 움직인 횟수를 저장

		// 알파벳을 숫자로 변환해서 리스트에 저장
		List<Integer> list = new ArrayList<>();
		for(char c : name.toCharArray()){ //문자열을 아스키코드로 변환
			int temp = c = 'A'; // 변환된 아스키 코드에서 -65(A)를 해서 A가 0이 되게 만든다
			list.add(temp); // 만들어진 A ~ Z / 0 ~ 25를 리스트에 정수로 담는다.
		}

		// 알파벳 상하 이동 처리
		for(int val : list){
			System.out.println();
			// A에 가까운지 Z에 가까운지 체크
			int unDown = Math.min(val,26 - val);
		}

		// 인트 move는 이동할 수 있는 최대 거리고
		int move = name.length() - 1;

		// i는 0부터 name의 길이 까지만 반복하며
		for(int i = 0; i < name.length(); i++){
			// next는 다음 위치이고
			int next  = i + 1;

			// 다음 위치가 총 이동 길이보다 작으면서 name의 다음번째인 next인덱스가 아스키 코드로 A일 경우
			while(next < name.length() && name.charAt(next)=='A'){
				next++;//  그 다음번째를 찾도록 next를 증가한다.
			}
			// case1은 현재 인덱스 + 문자의 길이 - 스킵할 길이 + 인덱스와 스킵할 크기를 뺀 길이중 장은 값을 가져온다.
			int case1 = i + name.length() - next + Math.min(i, name.length() - next);

			move = Math.min(move, case1);
		}


		return answer += move;
	}
}
