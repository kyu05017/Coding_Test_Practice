package old.단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.io.*;
import java.util.Scanner;

public class Bak_01_2588_곱셈 {

	/**
	 * 문제
	 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
	 *          472 ** (1)
	 *        x 385 ** (2)
	 * --------------------
	 *         2360 ** (3)
	 *        3776  ** (4)
	 *       1416   ** (5)
	 * --------------------
	 *       181720 ** (6)
	 *
	 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
	 * */
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		String b = scanner.next();

		char[] temp = b.toCharArray();

		String re = sb.append(a*(temp[2]-'0')).append("\n")
				.append(a*(temp[1]-'0')).append("\n")
				.append(a*(temp[0]-'0')).append("\n")
				.append(a*Integer.parseInt(b)).toString();

		bw.write(re);
		bw.flush();
		bw.close();
	}
}
