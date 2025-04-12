package 단계별풀이.연습.백준.조건문;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_02_9498_시험_성적 {

	public static void main(String[] args)throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());

		if(a >=90 && a <= 100){
			sb.append("A");
		}else if(a >= 80 && a <= 89){
			sb.append("B");
		}else if(a >= 70 && a <= 79){
			sb.append("C");
		}else if(a >= 60 && a <= 69){
			sb.append("D");
		}else{
			sb.append("F");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
