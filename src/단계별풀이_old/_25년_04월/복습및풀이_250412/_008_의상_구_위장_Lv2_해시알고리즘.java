package 단계별풀이_old._25년_04월.복습및풀이_250412;

import java.util.HashMap;
import java.util.Map;

public class _008_의상_구_위장_Lv2_해시알고리즘 {
	public static void main(String[] args) {
		System.out.println(solution(new String[][]{{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}}));
	}
	private static int solution(String[][] clothes){
		int answer = 1;

		// 각 옷의 종류별로 몇 벌이 있는지 체크
		Map<String,Integer> map = new HashMap<>();

		// 옷이름과 종류를 꺼내온다
		for(String[] cloth : clothes){

			// 타입을 가져온다.
			String type = cloth[1];

			// 저장
			map.put(
					type // 타입을 키값으로
					,map.getOrDefault(
							type, // 해당 키의 값이 존재한다면, 가져오고
							0// 아니라면 기본 값을 0으로 세팅
					) + 1// 없는 경우는 없음으로 1 추가
			);
		}

		// 저장된 map 의 값들의 목록만 가져온다.
		for(int cnt : map.values()){
			// key : headgear , value : 2
			// -> 입을 수 있는 경우 : 2 , 안 입는 경우 1
			// -> answer * 3;

			// key : eyewear , value : 1
			// -> 입을 수 있는 경우 : 1 , 안 입는 경우 1
			// -> answer * 2;
			answer *= (cnt+1);
		}

		// 모든 의류를 안입는 경우는 없기에 -1
		return answer-1;
	}
}
