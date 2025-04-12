package 단계별풀이.연습.백준.조건문;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_02_2753_윤년 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(st.nextToken());

		bw.write(String.valueOf((a%4==0&&(a%100!=0||a%400==0))?1:0));
		bw.flush();
		bw.close();
	}
}
