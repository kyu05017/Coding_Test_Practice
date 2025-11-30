package 단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.util.Scanner;

public class Bak_01_10951_A_Plus_B_4 {

	/**
	 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * */
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()){

			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a+b);
		}
	}
}
