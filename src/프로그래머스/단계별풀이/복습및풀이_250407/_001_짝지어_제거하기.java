package 프로그래머스.단계별풀이.복습및풀이_250407;

import java.util.Stack;

public class _001_짝지어_제거하기 {
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
	}
	private static int solution(String s){
		int answer = 0;

		/**
		 * 코드 풀이 이해 :
		 * 받은 문자열 s를 char 배열로 변환
		 * 반복문을 돌린다
		 * 조건 1. 스택이 비어있지 않으면서, 스택에 마지막이 반복문의 인자와 같을 경우
		 * stack에서 제거
		 * 조건 2. 조건에 만족하지 않는다면, stack에 추가
		 *
		 * 반환 : 스택이 비어있다면 (완벽하게 제거 되었다면) 1 : 아니라면 : 0
		 * */
		char[] tmp = s.toCharArray();
		Stack<Character> stack = new Stack<>();

		for(char i : tmp){
			if(!stack.isEmpty() && stack.peek() == i){
				stack.pop();
			} else {
				stack.push(i);
			}
		}

		/**
		 * 1회차 b -> else -> stack[ b ]
		 * 2회차 a -> else -> stack[ b , a ]
		 * 3회차 a -> if(peek() => a == a ) -> stack.pop() => stack[ b ]
		 * 4회차 b -> if(peek() => b == b ) -> stack.pop() => stack[ ]
		 * 5회차 a -> else -> stack[ a ]
		 * 6회차 a -> if(peek() => a == a ) -> stack.pop() => stack[ ]
		 *
		 * stack size 0
		 * */

		return stack.isEmpty()? 1: 0;
	}
}
