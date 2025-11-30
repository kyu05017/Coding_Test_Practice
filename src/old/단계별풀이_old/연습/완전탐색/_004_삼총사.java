package old.단계별풀이_old.연습.완전탐색;

public class _004_삼총사 {
	public static void main(String[] args) {

	}
	/**
	 ✅ 3중 for문 조합	i < j < k 조합 생성 완벽하게 구현
	 ✅ 조건 체크	sum == 0 딱 맞게 비교
	 ✅ 변수 처리	로컬 변수 sum 잘 활용함
	 ✅ 속도	3분 24초! 복습 + 새로운 조건에도 빠른 적용력 굿!
	 */
	private static int solution(int[] number){
		int answer = 0;

		for(int i = 0; i < number.length; i++){
			for(int j = i+1; j < number.length; j++){
				for(int k = j +1; k < number.length; k++){
					int sum = number[i] + number[j] + number[k];

					if(sum == 0){
						answer++;
					}
					// 개선 포인트 : sum은 매 반복마다 새로 선언되고 바로 값을 할당하니까,
					sum = 0;
				}
			}
		}

		return answer;
	}
}
