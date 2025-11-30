package old.단계별풀이_old._25년_04월.복습및풀이_250412;

import java.util.Stack;

public class _004_올바른_괄호_Lv2_스택응용 {
	public static void main(String[] args) {
		System.out.println(solution("))"));
	}
	/**
	 * 풀이 시간 : 16분
	 *
	 * 느낀 점 :
	 * 처음에 문자열로 풀었을 때에는
	 * ( 면 push 하고
	 * ) 면 pop 한다는 아이디어에서 시작했어
	 *
	 * 그러나 )부터 시작하거나 )가 반복되는 경우를 추가해서
	 * 문제를 보완해서
	 *
	 * 정확도 검사에는 정답을 맞췄지만,
	 * 효율성 ( 시간복잡도 ) 검사에서는 실패를 해서
	 *
	 * 아이디어를 찾는 도중
	 *
	 * 무조건 stack을 쓰는 것이 아닌
	 * 단순 카운트 방법도 있다는 아이디어를 찾게되서
	 * */
	// 문자열 방식 -> 정확성 검사 ( 정답 ) | 시간 정확도 -> (시간초과 )
	private static boolean solution1(String s){
		String[] tmp = s.split("");
		Stack<String> stack = new Stack<>();

		for(String t : tmp){
			if(t.equals("(")){
				System.out.println("스택에서 추가 : "+t);
				stack.push(t);
			} else if(t.equals(")")){
				if(stack.isEmpty()) {
					stack.push(t);
					continue;
				} else if(stack.peek().equals(")")){
					stack.push(t);
					continue;
				} else {
					System.out.println("스택에서 삭제 : "+t);
					stack.pop();
				}

			}
			System.out.println("스택 : "+stack.toString());
			System.out.println();
		}

		return stack.isEmpty();
	}

	// 카운트 방식
	private static boolean solution(String s){
		char[] tmp = s.toCharArray();
		int cnt = 0;
		for(char c : tmp){
			if(c == '('){
				cnt++;
			} else {
				cnt--;
			}
			if(cnt < 0){
				return false;
			}
		}
		return cnt == 0;
	}

	/// 심화버전 ( { [ ] } ) 의 괄호 출연
	private static boolean isValid(String s){

		Stack<Character> stack = new Stack<>();

		for(char c : s.toCharArray()){
			// 여는 괄호일 경우 push
			if(c == '(' || c == '{' || c == '['){
				// 스택에 추가
				stack.push(c);
			}
			// 닫는 괄호인 경우
			else if(c == ')' || c == '}' || c == ']'){
				// 시작부터 닫는 괄호인 경우는 false
				if(stack.isEmpty()) return false;

				// 스택에 가장 마지막 부분 가져오기
				char top = stack.peek();

				// 현재 들어올 c가 닫는 괄호이면서 top이 여는 괄호인 경우
				if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')){
					// 제거
					stack.pop();
				} else {
					return false;
				}
			}
		}
		// 모두 통과한다면 stack은 비어있다.
		return stack.isEmpty();
	}
}
