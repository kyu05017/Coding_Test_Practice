package 단계별풀이.연습.백준.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Bak_01_15792_A_Div_B_02 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BigDecimal BigA = new BigDecimal(st.nextToken());
		BigDecimal BigB = new BigDecimal(st.nextToken());

		System.out.println(BigA.divide(BigB,1000,BigDecimal.ROUND_HALF_UP));
	}
}
