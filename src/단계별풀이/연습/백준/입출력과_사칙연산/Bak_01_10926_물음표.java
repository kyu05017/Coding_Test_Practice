package 단계별풀이.연습.백준.입출력과_사칙연산;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_01_10926_물음표 {

	/**
	 * 문제 : 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
	 * 준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
	 * */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String dataIn = st.nextToken();

		String re = new StringBuilder(dataIn).append("??!").toString();

		bw.write(re);
		bw.flush();
		bw.close();
	}
}
