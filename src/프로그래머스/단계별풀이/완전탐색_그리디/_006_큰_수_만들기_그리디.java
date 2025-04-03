package 프로그래머스.단계별풀이.완전탐색_그리디;

import java.util.Arrays;
import java.util.Stack;

public class _006_큰_수_만들기_그리디 {
	public static void main(String[] args) {
		System.out.println(solution("1231234",3));
	}

	private static String solution(String number, int k){
		String answer = "";

		String[] temp_arr = number.split("");
		Stack<String> stack = new Stack<>();

		boolean isStacked = false;

		stack.push(temp_arr[0]);

		for(int i = 1; i < temp_arr.length; i++){

			if(isStacked){
				stack.push(temp_arr[i]);
			}

			int stack_in = Integer.parseInt(stack.peek());
			int now = Integer.parseInt(temp_arr[i]);
			System.out.println("stack_in : "+ stack_in);
			System.out.println("now : "+ now);
			System.out.println("nowStack"+ stack.toString());

			if(now > stack_in){
				stack.pop();
				stack.push(String.valueOf(now));
				isStacked = true;
			} else {
				isStacked = false;
			}
		}

		for(String s : stack){
			answer += s;
		}

		return answer;
	}
}
