package 단계별풀이.연습.백준.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bak_01_11021_A_Plus_B_7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());
		int i = 0;
		while(i < t){
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.printf("Case #%d: %d\n",i+1,a+b);

			i++;
		}
	}
}
