package 백준.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_03_10950_A_Plus_B_3 {
public static void main(String[] args)throws IOException {

		BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(be.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());

		for(int i=0;i<n;i++){

			st = new StringTokenizer(be.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.println(a+b);
			//?
		}

	}
}
