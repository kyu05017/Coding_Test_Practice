package 단계별풀이_old.연습.기초단계;

public class _001_자릿수_더하기 {
	public static void main(String[] args) {
		System.out.println(solution(5333));
	}

	/**
	 ✅ 문자열 변환	String.valueOf(n) → 자릿수 분해 방식
	 ✅ 반복문	배열 순회하며 누적합 잘 계산
	 ✅ 형 변환	Integer.parseInt()로 정확히 처리
	 */
	// 문자열로 푸는법
	public static int solution(int n) {
		int answer = 0;

		String temp = String.valueOf(n);
		String[] tempArr = temp.split("");

		for(int i = 0; i < tempArr.length;i++){
			answer += Integer.parseInt(tempArr[i]);
		}
		return answer;
	}

	// 문자열 없이 푸는 법
	public static int solution2(int n) {
		int answer = 0;

		while(n > 0){
			answer += (n%10); // 맨 뒷자리를 추출해서 더한다
			n /= 10; // 더 해진 뒷자리를 제거한다
		}

		return answer;
	}
}
