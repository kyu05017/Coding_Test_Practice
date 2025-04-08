package 프로그래머스.단계별풀이.복습및풀이_250406;

public class _011_최대값_최소값 {
	public static void main(String[] args) {

	}


	public String solution(String s) {
		/**
		 * 풀이시간 8분
		 *
		 * 내 느낀점 :
		 * 초반에는 배열자체에서 큰값과 작은 값을 어떻게 찾을까 하다가 버블정렬로 max와 min을 찾는 아이디어를 떠올림 코드를 작성
		 *
		 * 내 풀이 :
		 * 1.max에 큰 수를 지정
		 * 2.min에 음수로 큰 수를 지정
		 * 3.받은 문자열 s를 split(" ")을 사용해서 각 정수 형태의 문자로 치환
		 * 4. 생성한 문자열 반복문을 돈다,
		 * 5. Integer.parseInt로 정수로 변환
		 * 6. 버블 정렬 형테로 max보다 크다면 max를 치환
		 * 7. 버블 정렬 형태로 min보다 작다면 min을 치환
		 * 8. if -else 가 아닌 if if 형태 인 이유는 각 조건을 따로 해서
		 * 각 다른 각 max, min 검사를 모두 하기 위해 ( 숫자가 같을 수 있기 때문에 )
		 * 9. 만들어진 최소값과 최대값을 검증하기 위해 Math.max , Math.min을 사용해서
		 * 문자열로 반환
		 * */
		String answer = "";

		int max = -10000000;
		int min = 100000000;

		String[] temp = s.split(" ");

		for(int i = 0; i < temp.length; i++){
			int tmp = Integer.parseInt(temp[i]);

			if(tmp > max){
				max = tmp;
			}
			if(tmp < min){
				min = tmp;
			}
		}

		return Math.min(max,min) + " "+Math.max(max,min);
	}
}
