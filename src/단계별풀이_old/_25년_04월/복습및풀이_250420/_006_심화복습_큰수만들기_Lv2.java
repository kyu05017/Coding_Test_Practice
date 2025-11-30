package 단계별풀이_old._25년_04월.복습및풀이_250420;

import java.util.Stack;

public class _006_심화복습_큰수만들기_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution("1924",2));
	}
	public static String solution(String number, int k) {
		String answer = "";

		char[] numbers = number.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (char c : numbers) {
			System.out.println("c : "+c);
			while (!stack.isEmpty() && stack.peek() < c && k > 0){
				System.out.println("pop : "+stack.pop());
				k--;
			}
			System.out.println("push : "+c);
			stack.push(c);
		}

		// 현재 누락된 로직
		// k가 남아있다면, 뒤에서 k개를 잘라줘야 함
		while (k-- > 0) {
			stack.pop();
		}

		StringBuilder sb = new StringBuilder();
		for(char c : stack){
			sb.append(c);
		}

		return sb.toString();
	}
}
