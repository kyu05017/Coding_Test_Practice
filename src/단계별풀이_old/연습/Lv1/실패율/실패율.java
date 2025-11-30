package 단계별풀이_old.연습.Lv1.실패율;

import java.util.*;
import java.util.stream.Collectors;

public class 실패율 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(sol(5,new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
	}

	private static int[] sol(int n, int[] stages){
		List<Integer> list = Arrays.stream(stages).boxed().collect(Collectors.toList());
		Map<Integer,Double> map = new HashMap<>();
		int j = 1;
		while(j < n+1){
			System.out.println("원본"+list.toString());
			List<Integer> temp_list = new ArrayList<>();
			double temp2 = 0;
			System.out.println("j : "+j);

			for(int i = 0; i < list.size(); i++){
				if(j == list.get(i)){
					temp_list.add(i);
				}
			}
			System.out.println("tmp : "+temp_list.size());
			System.out.println("size : "+list.size());
			if(!temp_list.isEmpty()){
				temp2 = ((double) temp_list.size() /list.size());
				System.out.println("tmp/list.size() : "+temp2);
			}

			Collections.reverse(temp_list);

			for(int s : temp_list){
				list.remove(s);
			}
			map.put(j,temp2);

			System.out.println(temp_list.toString());
			System.out.println("변경"+list.toString());
			System.out.println("++++++++");
			System.out.println("--------------------------------");
			j++;
		}

		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
		List<Integer> answer = new ArrayList<>(keySet);

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}
