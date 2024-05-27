package 백준.입출력과_사칙연산;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bak_01_2558_A_Plus_B_2 {

	/**
	 * 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * */

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = sc.nextInt();
		int b = sc.nextInt();

		String re = String.valueOf(a+b);

		bw.write(re);
		bw.flush();
		bw.close();

	}
}
