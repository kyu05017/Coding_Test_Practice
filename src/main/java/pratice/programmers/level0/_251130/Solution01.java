package main.java.pratice.programmers.level0._251130;

/*
* 문제 1 — 문자열 뒤집기(기본 중 기본 패턴)
* 입력 예시: "hello"
* 출력 예시: "olleh"
*
* StringBuilder.reverse() 금지
* 직접 배열로 뒤집기
* */
public class Solution01 {

    public static void main(String[] a){
        System.out.println(reverseString02("Hello"));
    }
	
	
	// 내가짠 코드
    @SuppressWarnings("all")
    public static String reverseString01(String str){
        String result = "";

        if(str != null && str.length() > 0){

            String[] reverseArr = str.split("");
            StringBuffer sb = new StringBuffer();

            for(int i = reverseArr.length; i > 0; i--){
                System.out.println(i-1);
                sb.append(reverseArr[i-1]);
            }

            result = sb.toString();
        }

        return result;
    }
	
	/* 개선사항
	1. StringBuffer → StringBuilder 사용 권장
	2. 싱글 스레드 환경에서는 Builder가 더 빠름
	3. split("") 대신 char[] 사용하면 성능·가독성 ↑
	4. 불필요한 System.out.println(i-1) 제거
	5. if 조건에서 length > 0보다 length == 0일 때 return 처리하는게 더 깔끔함
	 */
	@SuppressWarnings("all")
	public static String reverseString02(String str){
		if(str == null || str.length() == 0)return "";
		
		char[] arr =str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = arr.length-1; i >= 0; i--){
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
