package main.java.pratice.programmers.level0._251130;

/*
 * 문제 1 — 문제 2 — 배열의 평균 구하기
 * 입력: [1,2,3,4,5]
 * 출력: 3.0
 *
 * sum, count 기본 패턴
 * double 캐스팅 주의
 * */
public class solution02 {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        
        System.out.println(average(arr));
    }
	// 내가 짠코드
    @SuppressWarnings("all")
    public static double average(int[] arr){

        if(arr != null && arr.length > 1){
            int sum = 0;
			
			for(int i = 0; i < arr.length; i++)
				sum += arr[i];
	        
	        return sum/ arr.length;
        
        } else return arr[0];
    }
	
	/*
	* 개선사항
	*
	* 1. 정수 나눗셈이 되어 버림 → double 캐스팅 필요
	* 예: 15 / 5 = 3.0 이지만
	* 예: 14 / 5 = 2.0 (2.8이 아님)
	* arr.length > 1 보다는
	* arr == null 또는 arr.length == 0 예외만 처리하는게 깔끔함
	* */
	public static double average02(int[] arr){
		if(arr == null || arr.length == 0) return 0;
		
		int sum = 0;
		for(int n : arr)sum += n;
		
		return (double)sum/arr.length;
	}
}
