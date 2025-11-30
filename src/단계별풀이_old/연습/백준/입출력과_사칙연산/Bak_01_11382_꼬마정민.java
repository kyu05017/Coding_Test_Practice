package 단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_01_11382_꼬마정민 {

	/**
	 * 문제 : 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
	 *
	 * */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());

		String re = String.valueOf(a+b+c);

		bw.write(re);
		bw.flush();
		bw.close();
	}
}
