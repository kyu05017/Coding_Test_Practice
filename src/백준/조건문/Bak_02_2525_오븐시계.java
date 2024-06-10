package 백준.조건문;

import java.util.Scanner;

public class Bak_02_2525_오븐시계 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String now = sc.nextLine();
		String[] nowTime = now.split(" ");

		int hour = Integer.parseInt(nowTime[0]);
		int min = Integer.parseInt(nowTime[1]);

		int target = sc.nextInt();

		System.out.println(hour );
		System.out.println(min);
		System.out.println(target );


		int tempTimeHour = 60/target;
		int tempTimeMin = 60%target;

		System.out.println(tempTimeHour);
		System.out.println(tempTimeMin);


		/*  월요일은 힘들어!!.*/
	}
}
