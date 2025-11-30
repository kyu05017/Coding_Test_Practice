package main.java.pratice.programmers.level0;

/*
 * 문제 3 — 짝수/홀수 개수 세기
 * 입력: 1,2,3,4,5,6]
 * 출력: {짝수:3, 홀수:3}
 *
 * 🎯 포인트
 * 조건문 기초
 * 반복문 패턴
 * return 구조 잡기
 * */
public class solution03 {
	
	public static void main(String[] args){
		int[] tg = {1,2,3,4,5,6};
		int[] arr = countEvenOdd(tg);
		
		System.out.println("짝수 : "+arr[0]+ " 홀수 : "+arr[1]);
	}
	
	// 내 풀이
	@SuppressWarnings("all")
	public static int[] countEvenOdd(int[] arr){
		int[] result = new int[2];
		
		if(arr != null && arr.length >0){
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != 0){
					if(arr[i]%2 == 0){
						result[0]++;
					} else {
						result[1]++;
					}
				}
			}
		}
		
		return result;
	}
	
	/*
	* 개선사항
	*   if(arr[i] != 0)
			→ 0은 짝수인데 현재는 counting에서 제외됨
			→ 불필요한 조건이므로 제거해야 함
	*
	* for문에서 index 접근 대신 for-each 사용 가능
	* result 배열 선언 깔끔
	* */
	public static int[] countEvenOdd02(int[] arr){
		int[] result = new int[]{0,0};
		if(arr == null || arr.length == 0)return result;
		
		for(int n : arr){
			if(n%2==0)result[0]++;
			else result[1]++;
		}
		return result;
	}
}
