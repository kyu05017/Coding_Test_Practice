package 단계별풀이_old.연습.스킬_체크_테스트_Level_1;

public class 문제1_다트게임 {

	public static void main(String[] args){
		System.out.println(sol01("10D4S10D"));
	}

	private static int sol01(String dartResult){
		int answer = 0;

		// 기회는 총3번
		int[] score = new int[3];

		String rex = "[0-9]";
		String[] dart = dartResult.split("");
		int idx = -1;

		for(int i = 0; i < dart.length;i++){
			// 숫자인 경우
			if(dart[i].matches(rex)){
				idx++;
				score[idx] = Integer.parseInt(dart[i]);
				// 점수가 10인 경우
				if(dart[i+1].matches(rex)){
					score[idx] *= 10;
				}
			} else {
				if (dart[i].equals("D")) {
					score[idx] = (int) Math.pow(score[idx], 2);
				} else if (dart[i].equals("T")) {
					score[idx] = (int) Math.pow(score[idx], 3);
				} else if (dart[i].equals("*")) {
					// '*'는 해당 라운드의 점수를 2배로 만들고, 이전 라운드의 점수도 2배로 만듦
					score[idx] *= 2;
					// 첫 번째 라운드인 경우에는 이전 라운드가 없으므로 조건 판단
					if (idx - 1 >= 0) {
						score[idx - 1] *= 2;
					}
				} else if (dart[i].equals("#")) {
					score[idx] *= -1;
				}
			}
		}

		for(int s : score){
			answer += s;
		}

		return answer;
	}
}
