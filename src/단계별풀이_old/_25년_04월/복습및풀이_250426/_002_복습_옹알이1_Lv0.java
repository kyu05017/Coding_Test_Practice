package 단계별풀이_old._25년_04월.복습및풀이_250426;

public class _002_복습_옹알이1_Lv0 {
	/**
	 * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
	 *
	 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
	 *
	 * 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return 하도록 solution 함수를 완성해주세요.
	 *
	 */
	public static void main(String[] args) {
		System.out.println("풀이 : "+solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
	}
	/// 내풀이 (반복문을 모두 돈 이후 체크)
	public static int solution(String[] babbling) {

		String[] can_speak = {"aya", "ye", "woo", "ma"};
		int answer = 0;

		for (String string : babbling) {
			String b = string;

			for (String s : can_speak) {
				if (b.contains(s)) b = b.replace(s, " ");
			}
			if (b.trim().isEmpty()) answer++;
		}
		return answer;
	}
	///  리팩토링 (반복문에서 체크)
	public static int solution2(String[] babbling){
		String[] canSpeak = {"aya", "ye", "woo", "ma"};
		int answer = 0;

		for (String word : babbling) {
			for (String speak : canSpeak) {
				word = word.replace(speak, " ");
			}
			if (word.trim().isEmpty()) {
				answer++;
			}
		}
		return answer;
	}
}
