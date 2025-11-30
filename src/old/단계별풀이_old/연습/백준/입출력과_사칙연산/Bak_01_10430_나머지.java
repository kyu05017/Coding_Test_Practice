package old.단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_01_10430_나머지 {

	/**
	 * 문제 :
	 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
	 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	 * */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		String re = sb.append(
				(a+b)%c
		).append("\n").append(
				((a%c)+(b%c))%c
		).append("\n").append(
				(a*b)%c
		).append("\n").append(
				((a%c)*(b%c))%c
		).toString();

		bw.write(re);
		bw.flush();
		bw.close();
	}
}
