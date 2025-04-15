package 단계별풀이._25년_04월.복습및풀이_250413;

public class _002_복습2_문자열_압축_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution("xababcdcdababcdcd"));
	}


	private static int solution(String s){

		// 원본 버전의 길이 저장
		int answer = s.length();

		// 압축될 수 있는 가장 큰 크기까지 반복
		for(int step = 1; step <= s.length()/2; step++){

			// 임시로 저장될 문자열
			StringBuilder sb = new StringBuilder();

			// 최초로 압축될 단어 임시저장
			String prev = s.substring(0,step);

			// 카운트 저장 ( 최초 1 )
			int count = 1;

			// 잘라 낸 부분 부터 압축 단위 만큼 증가하며 검사!
			for(int j = step; j <= s.length(); j+=step){
				// 문자열 만들기
				// 압축단위와 문자크기가 길이보다 작거나 같음 문자열 안에서 만들고
				// 압축단위와 문자크기가 길이보다 크면 문자열에서 단위만큼 잘라냄
				String current = (step + j <= s.length())? s.substring(j,j+step):s.substring(j);

				if(prev.equals(current)){
					count++;
				} else {
					// 이미 카운트가 1개 이상일 경우
					if(count > 1) sb.append(count);
					// 검색된 문자열을 추가
					sb.append(prev);
					// 검색 대상 전환
					prev = current;
					// 카운트 초기화
					count = 1;
				}
			}
			// 마지막 남아있을 경우 추가 (홀수 대비)
			if(count > 1)sb.append(count);
			sb.append(prev);

			// 갱신되는 길이 중 작은걸로 갱신
			answer = Math.min(answer,sb.length());
		}
		return answer;
	}

	// 실패
	private static int solution1(String s){

		// 문자열 길이
		int origin = s.length();

		// 문자열이 압축되는 최대값
		int zip = origin/2;


		// 압축 단위 만큼 반복
		for(int i = 1; i < zip; i++){
			StringBuilder sb = new StringBuilder();

			// 압축될 단어
			String prev = s.substring(0,i);

			// 카운트 최소값 1
			int cnt = 1;

			// 단어를 순회하며 검색 ( 잘린 위치를 제외하고 마지막 까지 압축 단위 만큼 증가)
			for(int j = i; j <= s.length(); j+=i){
				// 비교값 선언
				// 압축 단위크기  + 검색 단위 <= 전체크기 보다 작거나 같다면
				// 현재 위치 j 부터 압축단위 만큼의 단어를 구함
				// 압축 단위크기  + 검색 단위 > 전체크기
				String current = (i+j <= origin)? s.substring(j,j+i):s.substring(j);


				if(i+j <= origin){
					current = s.substring(j,j+i);
				}
				// 압축 단위크기  + 검색 단위 > 전체크기
				else {
					current = s.substring(j);
				}

				if(prev.equals(current)){
					cnt++;
				} else {
					// 단어에 갯수가 1을 초과하는 경우 문자열 앞에 카운트를 붙여준다.
					if(cnt > 1 ){
						sb.append(cnt);
					}
					// 문자열 추가
					sb.append(prev);

					// 다음 검색단어 삽입
					prev = current;

					//카운트 초기화
					cnt = 1;
				}
			}
			if(cnt > 1 ){sb.append(cnt);}
			sb.append(prev);

			origin = Math.min(origin,sb.length());
		}
		return origin;
	}
}
