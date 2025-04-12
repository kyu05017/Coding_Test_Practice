package 단계별풀이.복습및풀이_250412;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _003_완주하지_못한_선수_정렬_카운팅 {
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"marina","marina", "josipa", "nikola", "vinko", "vinko","filipa"},new String[]{"josipa", "filipa", "marina", "nikola"}));
	}

	/**
	 * 풀이 시간 : 22분
	 *
	 * 느낀 점 :
	 * map에서 조건문 하는 방법이 기억이 나질 않아서, 자료를 찾아봤어!
	 * 그리고 초반에 중복된 인원을 카운팅 하는법을 찾느라 시간을 많이 썼어
	 * */

	// 내풀이
	private static String solution1(String[] participant, String[] completion){
		String answer = "";

		Map<String,Integer> map = new HashMap<>();

		for(String p : participant){
			map.put(
					p,
					map.getOrDefault(p,0)+1
			);
		}

		for(String c : completion){
			map.put(
					c,
					map.getOrDefault(c,0)-1
			);
		}

		for(Map.Entry<String,Integer> e : map.entrySet()){
			if(e.getValue() == 1){
				answer += e.getKey();
			}
		}

		return answer;
	}
	// 여럿 사람이 중복이 되고, 2명이상 완주하지 못한다는 케이스 [보너스 문제]
	private static String solution2(String[] participant, String[] completion){

		Map<String,Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();

		for(String p : participant){
			map.put(
					p,
					map.getOrDefault(p,0)+1
			);
		}

		for(String c : completion){
			map.put(
					c,
					map.getOrDefault(c,0)-1
			);
		}

		for(Map.Entry<String,Integer> e : map.entrySet()){
			if(e.getValue() != 0){
				list.add(e.getKey());
			}
		}
		return list.toString();
	}

	// 복수 버전 - 스트림
	private static String solution(String[] participant, String[] completion){
		// 1. 참가자 카운팅
		Map<String, Long> map = Arrays
				.stream(participant)// 스트링 문자열 스트림화
				.collect(// 콜렉션 화
						Collectors.groupingBy( // 그룹화
								Function.identity(), // 자기 자신을 key로 그룹핑
								Collectors.counting()// 같은 이름 몇 번 나왔는지 count
						)
				);

		// 2. 완주자 카운팅 차감
		Arrays.stream(completion).forEach( name ->{
			map.put(name, map.getOrDefault(name, 0L) - 1);
		});

		return map.entrySet()// 엔트리셋 변환
				.stream()// 스트림화
				.filter( e -> e.getValue() > 0) // 벨류값이 0보다 큰놈들 => 완주하지 못한 사람
				.map(Map.Entry::getKey)// 키만 따로 묶고
				.collect(Collectors.toList())// 리스트화 시켜서
				.toString();// 문자열 반환
	}
	// 단수 버전 - 스트림
	private static String solution4(String[] participant, String[] completion){
		// 1. 참가자 카운팅
		Map<String, Long> map = Arrays
				.stream(participant)// 스트링 문자열 스트림화
				.collect(// 콜렉션 화
						Collectors.groupingBy( // 그룹화
								Function.identity(), // 자기 자신을 key로 그룹핑
								Collectors.counting()// 같은 이름 몇 번 나왔는지 count
						)
				);

		// 2. 완주자 카운팅 차감
		Arrays.stream(completion).forEach( name ->{
			map.put(name, map.getOrDefault(name, 0L) - 1);
		});

		return map.entrySet()// 엔트리셋 변환
				.stream()// 스트림화
				.filter( e -> e.getValue() > 0) // 벨류값이 0보다 큰놈들 => 완주하지 못한 사람
				.map(Map.Entry::getKey)// 키만 따로 묶고
				.findFirst() // 가장 첫번째 찾기
				.orElse(""); // null이라면 "" 반환
	}
}
