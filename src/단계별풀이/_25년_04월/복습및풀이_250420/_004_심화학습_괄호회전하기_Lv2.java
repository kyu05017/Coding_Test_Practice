package 단계별풀이._25년_04월.복습및풀이_250420;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _004_심화학습_괄호회전하기_Lv2 {
	public static void main(String[] args) {
		//System.out.println(solution("[(){{}}]"));
		System.out.println(solution1("[](){}"));
	}
	/// 실패코드
	public static int solution(String s) {
		int answer = 0;

		String[] temp = s.split("");

		for(int i = 0; i < temp.length; i++){

			// 검사하기
			String checkS = s;
			// = checkS.replaceAll("()","");
			//checkS = checkS.replaceAll("{}","");
			//checkS = checkS.replaceAll("[]","");

			System.out.println("checkS : "+checkS);
			System.out.println("s : "+s);

			if(checkS.isEmpty()){
				System.out.println(" 정답 ");
				answer++;
			}

			String tmp = s.split("")[0];
			System.out.println("맨 앞글자 "+tmp);

			s = s.substring(1);
			s += tmp;
			System.out.println("뒤집힌 문자열 : "+s);
			System.out.println();
		}

		return answer;
	}

	// 큐 + 스택
	public static int solution1(String s) {
		int answer = 0;

		// 홀수는 불가능
		if(s.length()%2!=0)return 0;

		String[] tmp = s.split("");
		Queue<String> queue = new LinkedList<>();
		for(String t : tmp){
			queue.offer(t);
		}
		int cnt = 0;
		boolean isEnd = true;

		while(cnt < s.length()){
			StringBuilder tempString = new StringBuilder();
			for(String t : queue)tempString.append(t);

			Stack<Character> stack = new Stack<>();
			char[] tempArr = tempString.toString().toCharArray();
			boolean isOkay = false;
			for(int i = 0; i < tempArr.length; i++){
				char c = tempArr[i];
				if(c == '(' || c == '{' || c == '['){
					// 스택에 추가
					stack.push(c);
				} else {
					if(stack.isEmpty()){
						isOkay = false;
						break;
					}

					// 스택에 가장 마지막 부분 가져오기
					char top = stack.peek();

					// 현재 들어올 c가 닫는 괄호이면서 top이 여는 괄호인 경우
					if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')){
						// 제거
						stack.pop();
					} else {
						isOkay = false;
						break;
					}
				}
				if(stack.isEmpty())isOkay=true;
			}
			System.out.println("tempString : " +tempString + " | isOaky " +isOkay);

			if(isOkay)answer++;
			// 문자 뒤집기
			String p = queue.poll();
			queue.offer(p);

			// 무한루프 방지 카운트
			cnt++;
		}
		return answer;
	}
}
