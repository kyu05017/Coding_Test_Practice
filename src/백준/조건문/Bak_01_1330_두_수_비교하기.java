package 백준.조건문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bak_01_1330_두_수_비교하기 {

	public static void main(String[] args)throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if(a>b){
			sb.append(">");
		}else if(a<b){
			sb.append("<");
		}else if(a==b){
			sb.append("==");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
