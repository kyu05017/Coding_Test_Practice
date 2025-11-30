package 단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_01_1001_A_Minus_B {

	/**
	 * 문제 : 정수 A와 B를 입력받은 다음,A-B를 출력하는 프로그램 작성
	 */
	public static void main(String[] arg) throws IOException {

		// 입력부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 출력부
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int result = a - b;

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
