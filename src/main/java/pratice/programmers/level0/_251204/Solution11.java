package main.java.pratice.programmers.level0._251204;

/*
 * 🟡 문제 11 — 두 배열 합치기(정렬 없이 단순 merge)
 * 입력 예시: a = [1,3,5], b = [2,4,6]
 * 출력 예시: [1,3,5,2,4,6]
 *
 * 🎯 포인트
 * 배열 길이 → 새 배열
 * 복사 패턴
 * index 관리
 * */
public class Solution11 {
	
	public static void main(String[] args){
		
		int[] a = {1,3,5};
		int[] b = {2,4,6};
		
		int[] result = merge(a,b);
		
		for(int c : result){
			System.out.println(c);
		}
	}
	
	public static int[] merge(int[] a, int[] b) {
		
		int max_length = a.length + b.length;
		int cnt = 0;
		int idx = 0;
		int[] result = new int[max_length];
		
		while(cnt < 2){
			int remit = 0;
			int[] target = null;
			if(cnt == 0){
				remit = a.length;
				target = a;
			} else {
				remit = b.length;
				target = b;
			}
			
			for(int i = 0; i < remit; i++){
				result[idx] = target[i];
				idx++;
			}
			
			cnt++;
		}
		
		// TODO
		return result;
	}
}
