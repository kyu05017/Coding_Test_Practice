package 백준.입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_01_1008_A_Div_B {

	/**
	 *
	 * 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
	 * */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());

		double re = a/b;

		bw.write(String.valueOf(re));
		bw.flush();
		bw.close();
	}
}
