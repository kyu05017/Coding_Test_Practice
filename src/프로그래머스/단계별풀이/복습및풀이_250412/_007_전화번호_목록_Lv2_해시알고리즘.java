package 프로그래머스.단계별풀이.복습및풀이_250412;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _007_전화번호_목록_Lv2_해시알고리즘 {
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
	}
	// startsWith 사용한 코드
	private static boolean solution2(String[] phone_book){

		// 오름 차순 정렬
		Arrays.sort(phone_book);

		// 인덱스 0과 인덱스 1을 체크해야 하기 때문에, 길이는 -1
		for(int i = 0; i < phone_book.length -1; i++){
			// 다음에 인덱스의 존재하는 문자열이 현재 문자열로 시작 한다면, false반환
			if(phone_book[i+1].startsWith(phone_book[i])){
				return false;
			}
		}
		return true;
	}


	// Set 해시를 사용한 코드
	private static boolean solution(String[] phone_book){

		Set<String> set = new HashSet<>();

		// 셋에 모든 내용을 담는다.
		for(String s : phone_book){
			set.add(s);
		}

		// 접두어 검사
		for(String s: set){
			String tmp = s;
			for(int i = 1; i < s.length(); i++){
				// 접두어를 만든다.
				String sliced = tmp.substring(0,i);
				// 생성된 접두어가 set안에 존재한다면, false 반환
				if(set.contains(sliced)){
					return false;
				}
			}
		}
		return true;
	}
}
