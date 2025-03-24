package 프로그래머스.Lv1.옹알이2;

public class 옹알이2 {

	public static void main(String[] args){
		System.out.println(sol(new String[]{"yayae"}));
	}

	private static int sol(String[] babbling){
		int answer = 0;

		//발음 가능한 문자
		String[] my = {"aya", "ye", "woo", "ma"};

		// 입력된 문자열을 순회
		for(String s : babbling){

			// 같은 문자를 두번 반복하는지
			boolean isDouble = false;

			// 발음할 수 있는 문자열을 순회
			for(String x : my){
				// 두번발음 하는 경우가 포함되어있다면,
				if(s.contains(x+x)){
					// 플래그를 바꾸고 브레이크
					isDouble = true;
					break;
				}
				// 발음 가능한 문자를 모두 공란처리
				s = s.replace(x," ");
			}
			// 두번발음 하는게 아니면서 문자열이 비어있을 경우만 증감
			if(!isDouble && s.trim().isEmpty()){
				answer++;
			}
		}

		return answer;
	}
}
