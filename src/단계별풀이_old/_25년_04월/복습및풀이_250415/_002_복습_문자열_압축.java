package 단계별풀이_old._25년_04월.복습및풀이_250415;

public class _002_복습_문자열_압축 {
	public static void main(String[] args) {
		System.out.println(solution("ababcdcdababcdcd"));
	}
	static int solution(String s){

		int answer = s.length();

		for(int i = 1; i <= s.length()/2; i++){
			String prev = s.substring(0,i);

			int cnt = 1;
			StringBuilder sb = new StringBuilder();

			for(int j = i; j <= s.length(); j+=i){
				String current = (i+j <= s.length())? s.substring(j,j+i) : s.substring(j);

				if(prev.equals(current)) {
					cnt++;
				} else {
					if(cnt > 1){
						sb.append(cnt);
					}

					sb.append(prev);
					cnt = 1;
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
