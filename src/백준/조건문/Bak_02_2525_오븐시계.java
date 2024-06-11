package 백준.조건문;

import java.util.Scanner;

public class Bak_02_2525_오븐시계 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int target = sc.nextInt();

		int resultHour = hour+(target/60);
		int resultMin = min+(target%60);

		if(resultMin >= 60){
			resultMin -= 60;
			resultHour++;
		}
		resultHour = (resultHour > 23)?resultHour-24:resultHour;

		System.out.println(resultHour+" "+resultMin);
	}
}
