package old.단계별풀이_old.연습.백준.조건문;

import java.io.*;
import java.util.StringTokenizer;

public class Bak_02_2884_알람_시계 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());

		sb.append(String.valueOf((min < 45)?((hour==0)?23:hour-1):(hour)));
		sb.append(" ");
		sb.append(String.valueOf((min >= 45)?min-45:60-(45 - min)));


		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
