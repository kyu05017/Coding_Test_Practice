package 단계별풀이.연습.백준.조건문;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Bak_02_2525_오븐시계 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int target = sc.nextInt();

		int resultHour = hour+(target/60);
		int resultMin = min+(target%60);

		if(resultMin >= 60){
			resultMin -= 60;
			resultHour++;
		}
		resultHour = (resultHour > 23)?resultHour-24:resultHour;

		bw.write(sb.append(resultHour).append(" ").append(resultMin).toString());
		bw.flush();
		bw.close();
	}
}
