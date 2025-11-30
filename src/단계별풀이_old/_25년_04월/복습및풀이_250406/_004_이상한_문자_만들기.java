package 단계별풀이_old._25년_04월.복습및풀이_250406;

public class _004_이상한_문자_만들기 {
	public static void main(String[] args) {

	}
	public String solution(String s) {
		String answer = "";
		String temp = s.replaceAll(" ","_");

		int j = 0;
		char[] tmp = temp.toCharArray();

		for(int i = 0; i < tmp.length; i++){
			if(String.valueOf(tmp[i]).equals("_")){
				j = 0;
			} else if(j % 2 == 0){
				tmp[i] = Character.toUpperCase(tmp[i]);
				j++;
			} else if(j % 2 != 0){
				tmp[i] = Character.toLowerCase(tmp[i]);
				j++;
			}
			answer += tmp[i];
		}
		return answer.replaceAll("_"," ");
	}
}
