package 프로그래머스.단계별풀이.복습풀이_250406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class _010_K번째수 {
	public static void main(String[] args) {

	}

	// 내풀이
	public int[] solution(int[] array, int[][] commands) {
		/**
		 *내 느낀점 :
		 * 문제를 끝까지 읽지 않고 정렬을 빼먹고 계속 도전했음, 고로 원하는 결과와
		 * 내 답의 차이점을 찾는데 시간을 쏟음
		 *
		 * 문제를 하나하나 천천히 읽고 제대로 이해하자
		 *
		 * 내 풀이 해설 :
		 * 1.반환되는 문자열은 commands의 길이와 같기에 초기화
		 * 2. 2차원 배열의 가장 앞 부분 반복 총 3회
		 * 3. 이중 반복문으로 0번째 인덱스 ~ 1번째 인덱스의 숫자에 사이에 정수 배열을
		 * List로 만듬 ( 이유 : 크기의 자율성을 위해 List인터페이스 사용, 배열을 사용하면 배열의 사이즈 이슈로 boundException 또는 반복문 필요)
		 * 4. 받은 List를  Collections.sort 사용해서 정렬
		 * 5. commands 인덱스2번째의 k값을 채번해서 각 배열에 답음
		 * */
		int[] answer = new int[commands.length];

		for(int i = 0; i < commands.length; i++){
			int[] tmp = commands[i];
			List<Integer> l = new ArrayList<>();
			for(int j = tmp[0]-1; j < tmp[1]; j++){
				l.add(array[j]);
			}
			Collections.sort(l);

			answer[i]= l.get(tmp[2]-1);
		}
		return answer;
	}
	public int[] solution2(int[] array, int[][] commands) {
		return Arrays.stream(commands).mapToInt(command -> {
					return Arrays.stream(array, command[0] - 1, command[1])
							.sorted()
							.toArray()[command[2] - 1];
				})
				.toArray();
	}
}
