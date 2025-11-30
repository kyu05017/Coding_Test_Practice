package 단계별풀이_old._25년_04월.복습및풀이_250420;

public class _002_복습_문자열압축_Lv2 {
	public static void main(String[] args) {
		System.out.println(solution("aabbaccc"));
	}
	public static int solution(String s) {
		int answer = s.length();

		int size = s.length()/2;

		for(int i = 1; i <=size; i++){

			String prev = s.substring(0,i);
			StringBuilder sb = new StringBuilder();
			int cnt = 1;

			for(int j = i; j < s.length(); j+=i){
				String current;

				if(i+j<=s.length()){
					current = s.substring(j,i+j);
				} else {
					current = s.substring(j);
				}
				if(prev.equals(current)){
					cnt++;
				} else {
					if(cnt > 1)sb.append(cnt);
					sb.append(prev);
					prev = current;
					cnt = 1;
				}
			}
			if(cnt > 1)sb.append(cnt);
			sb.append(prev);
			answer = Math.min(sb.length(),answer);
		}

		return answer;
	}
}
