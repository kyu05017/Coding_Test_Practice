package 단계별풀이.연습.완전탐색_그리디;

import java.util.Stack;

public class _006_큰_수_만들기_그리디_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution("1924",2));
	}
	// 내풀이 실패
	private static String solution2(String number, int k){
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
	private static String solution(String number, int k){
		String answer = "";

		Stack<Character> stack = new Stack<>();

		System.out.println("현재 K :" + k);

		for(char c : number.toCharArray()){
			System.out.println("----------------------------------------------");

			// 스택이 비어있지 않으면서, 스택의 가장 마지막 값이 C 보다 작으면서, 0이 K보다 큰 동안
			System.out.println("스택이 비어있는가? : "+ (stack.isEmpty()? "비어있음":"값이있음"));
			System.out.println("스택에 마지막 값 : "+ (( stack.isEmpty()) ? "값이 없음": "["+stack.peek()+"]"));
			System.out.println("현재 숫자 : "+c);
			while(!stack.isEmpty() && stack.peek() < c && k > 0){
				System.out.println("    스택에서 꺼낸 값 : "+stack.pop());
				k--;
				System.out.println("    남은 자리수 : "+k);
			}

			stack.push(c);
			System.out.println("스택 : "+stack.toString());
			System.out.println("----------------------------------------------\n");
		}

		while(k-- > 0){
			stack.pop();
		}

		StringBuilder sb = new StringBuilder();
		for(char c : stack){
			sb.append(c);
		}

		return sb.toString();
	}
}
