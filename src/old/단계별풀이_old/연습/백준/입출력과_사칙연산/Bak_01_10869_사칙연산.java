package old.단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_01_10869_사칙연산 {


	/**
	 * 문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
	 * */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		StringBuilder sb = new StringBuilder();

		String re = sb.append(String.valueOf(a+b)).append("\n")
				.append(String.valueOf(a-b)).append("\n")
				.append(String.valueOf(a*b)).append("\n")
				.append(String.valueOf(a/b)).append("\n")
				.append(String.valueOf(a%b)).toString();

		bw.write(re);
		bw.flush();
		bw.close();
	}
}
