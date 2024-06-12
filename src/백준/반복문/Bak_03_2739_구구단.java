package 백준.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_03_2739_구구단 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());

		for(int i=1;i<10;i++){
			sb.append(a).append(" ").append("*").append(" ").append(i).append(" ").append("=").append(" ").append(a*i);
			if(i!=9){
				sb.append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
