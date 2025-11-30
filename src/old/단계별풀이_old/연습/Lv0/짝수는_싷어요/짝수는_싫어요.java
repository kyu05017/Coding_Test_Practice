package old.단계별풀이_old.연습.Lv0.짝수는_싷어요;
/**
    문제설명 :
    정수 n이 매개변수로 주어질 때, 
    n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록,
    solution 함수를 완성해주세요.
*/
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n ) {
        int[] result = IntStream.rangeClosed(0,n).filter(e -> e%2 !=0).toArray();

        /*
            IntStream 선언으로 스트림을 만들어주고
            rangeClosed로 0부터 ~ n 만큼의 정수에서
            filter ( 내부 인가가 2의 나머지가 0이 아닌것만 )
            toArray 로 배열로 반환
        */
        return result;
    }
}
