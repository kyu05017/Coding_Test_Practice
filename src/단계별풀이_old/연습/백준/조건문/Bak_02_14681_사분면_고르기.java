package 단계별풀이_old.연습.백준.조건문;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Bak_02_14681_사분면_고르기 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;

		if(a>0&&b>0){
			result = 1;
		}else if(a>0&&b<0){
			result = 4;
		}else if(a<0&&b>0){
			result = 2;
		}else{
			result = 3;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
