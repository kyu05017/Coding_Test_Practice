package old.단계별풀이_old._25년_04월.복습및풀이_250408;

public class _003_문자열_압축 {
	public static void main(String[] args) {
		System.out.println(solution("aabbaccc"));
	}





	private static int solution(String s){

		/**
		 * 1. 원래 문자열의 길이를 저장한다.
		 * 2. 문자열의 길이 / 2를 함으로 나눌 수 있는 최소 길이 를 구한다 ( Ex : 7 / 2 => 4 ) ( 압축 범위 1~3 )
		 * 3. 압축 범위 만큼의 첫 문자를 저장한다.
		 * 4. 최초 카운터 1 저장
		 * 5. 압축 크기 부터  문자열 길이 만큼 반복 문 돌리고 증가량은 압축량 만큼 증가한다.
		 * 6. 임시로 저장될 문자열 선언
		 * 7-1. 반복 길이 + 압축 크기가 문자열 길이 보다 작거나 같으면 반복횟수 ~ 압축길이 + 반복횟수 만큼 문자열을 자르고 임시 저장
		 * 7-2. 반복 길이 + 압축 크기가 문자열 보다 크다면 반복길이를 잘라 임시 저장
		 * 8-1. 압축 범위 만큼의 첫 문자과 임시 저장된 문자가 같다면 카운트 증가
		 * 8-2. 아니라면 카운트와 문자을 저장 하고, 카운트가 1보다 크다면 카운트 포함 저장, 아니라면 문자만 저장
		 * 9. 카운트가 1보다 크다면 카운트 저장
		 * 10.문자열도 저장
		 * 11.최소 길이 갱신을 위해 원본 길이와, 계산된 길이를 비교해 작은 수를 반환
		 */


		int answer = 0;

		// 압축 안한 상태의 기본 값 ( 문자열의 길이 )
		int origin = s.length();

		// 나눌 수 있는 크기 Ex : 7 -> 1~ 3 까지 증가
		for(int step = 1; step < s.length() / 2; step++){
			StringBuilder sb = new StringBuilder();

			// 나눈 문자 최소
			String prev = s.substring(0,step);
			System.out.println("["+step+" 분할] prev : "+prev);

			// 나뉘는 카운트
			int cnt = 1;
			System.out.println("cnt : "+ cnt);

			for(int j = step; j <= s.length(); j+=step){
				System.out.println("    step : "+step);
				System.out.println("    j : "+j);
				String current;

				///  j + step이 s의 길이보다 작거나 같을 경우
				System.out.println("    j + step : "+(j + step));
				System.out.println("    s.length() : "+s.length());

				if(j + step <= s.length()){
					System.out.println("    j + step <= s.length() => true");
					current = s.substring(j,j + step);
					System.out.println("    current : "+ current);
				} else {
					System.out.println("    j + step <= s.length() => false");
					current = s.substring(j);
					System.out.println("    current : "+ current);
				}

				if (prev.equals(current)) {
					System.out.println("    prev == current");
					cnt++;
					System.out.println("    cnt : "+cnt);
				} else {
					System.out.println("    prev != current");
					if(cnt > 1) {
						System.out.println("        cnt : " + cnt);
						System.out.println("        cnt > 1");
						sb.append(cnt);
						System.out.println("        sb : "+sb.toString());
					}

					sb.append(prev);
					System.out.println("    sb : "+sb.toString());
					prev = current;
					System.out.println("    prev : "+prev);
					cnt = 1;
					System.out.println("    cnt : 1");
				}
				System.out.println();
			}
			System.out.println();
			if(cnt > 1 ){sb.append(cnt);}
			sb.append(prev);

			origin = Math.min(origin,sb.length());
		}
		return answer;
	}

}
