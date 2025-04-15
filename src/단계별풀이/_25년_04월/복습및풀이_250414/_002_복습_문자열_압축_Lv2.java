package 단계별풀이._25년_04월.복습및풀이_250414;

public class _002_복습_문자열_압축_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution("aabbaccc"));
	}

	public static int solution(String s) {

		// 원본 길이 저장
		int answer = s.length();

		for(int i = 1; i <= s.length()/2; i++){

			// 문자열 저장
			StringBuilder sb = new StringBuilder();

			// 최초 검사 문자 저장
			String prev = s.substring(0,i);

			// 최소 카운트 저장
			int cnt = 1;

			for(int j = i; j <= s.length(); j+=i){
				// 문자열 보다 작으면 문자열 내에서 아니라면 나머지를 자른다.
				String current = (i+j <= s.length())? s.substring(j,j+i) : s.substring(j);

				if(prev.equals(current)){
					cnt++;
				} else {
					// 카운트가 1보다 클 경우 문자열에 추가
					if(cnt > 1)sb.append(cnt);
					// 문자열에 문자 추가
					sb.append(prev);
					// 카운트 초기화
					cnt = 1;
					// 검색할 단어 교체
					prev = current;
				}
			}
			if(cnt > 1)sb.append(cnt);
			sb.append(prev);

			answer = Math.min(answer,sb.length());
		}


		return answer;
	}
}
