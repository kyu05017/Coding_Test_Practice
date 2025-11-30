package old.단계별풀이_old._25년_04월.복습및풀이_250420;

import java.util.Stack;

public class _003_심화학습_괄호변환_Lv2_스택 {
	public static void main(String[] args) {
		solution("(()(");

	}

	// 기본 풀이
	static boolean solution(String s) {
		boolean answer = true;

		char[] tmp = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < tmp.length; i++){
			char temp = tmp[i];

			if(temp == '('){
				stack.push('(');
			} else if(temp == ')'){
				if(stack.isEmpty()){
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
