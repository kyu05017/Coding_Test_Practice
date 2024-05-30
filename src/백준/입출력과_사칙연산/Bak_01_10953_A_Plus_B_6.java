package 백준.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bak_01_10953_A_Plus_B_6 {


	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());

		for(int i = 0; i < t; i++){
			st = new StringTokenizer(br.readLine());
			String tmpInt = st.nextToken();
			String[] tmp = tmpInt.split(",");

			System.out.println(Integer.parseInt(tmp[0])+Integer.parseInt(tmp[1]));
		}
	}
}
