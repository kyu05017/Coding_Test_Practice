package old.단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Bak_01_15740_A_Plus_B_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger bigA = new BigInteger(st.nextToken());
		BigInteger bigB = new BigInteger(st.nextToken());

		System.out.println(bigA.add(bigB));
	}
}
