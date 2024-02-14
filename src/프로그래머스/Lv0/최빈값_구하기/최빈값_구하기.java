import java.util.*;

/**
    문제설명 :
        최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
        정수 배열 array가 매개변수로 주어질 때, 
        최빈값을 return 하도록 solution 함수를 완성해보세요. 
        최빈값이 여러 개면 -1을 return 합니다.
*/

class 최빈값_구하기 {

    public int solution(int[] a) {
        int answer = 0;
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int number : arr){
            // getOrDefault는 키가 존재하는 경우 해당 키의 값을 반환 하지만 
            // 아닌 경우 지정한 기본값을 반환 한다.
            int count = map.getOrDefualt(number,0) + 1;

            //new int[]{1,1,2,3,4}
            
            // 1 회차에서는 arr에 값이 map에 키로 존재하지 않기 때문에 
            // 1 > 0으로 count의 값이 더 크다
            // 따라서 maxCount 는 1 이 되고 
            // answer 는 배열의 첫값이 들어간다.

            // 2 회차에서는 arr에 값이 map에 존재하기 때문에 
            // count는 1의 키 값인 1 + 1이 되어 2가된다
            // count 2는 maxCount 1보다 크기 때문에
            // maxCount는 count 2가 되고
            // answer = number 1이 된다.

            // 3회차에서는 {2}라는 정수가 map 안에 존재 하지 않기 때문에,
            // count는 1이되고 
            // count가 maxCount보다 작으며 같지 않기 때문에 조건문을 통과하지 못한다.
            // maxCount는 2, answer은 1

            
            if(count > maxCount){
                maxCount = count;
                answer = number;
            } else if(count == maxCount){
                answer = -1;
            }
            map.put(number,count);
        }

        return answer;
    }
}
