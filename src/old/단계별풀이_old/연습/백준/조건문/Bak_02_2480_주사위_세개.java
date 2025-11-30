package old.단계별풀이_old.연습.백준.조건문;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bak_02_2480_주사위_세개 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[3];
		int result = 0;
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());

		if((arr[0]==arr[1])&&(arr[1]==arr[2])){
			result = 10000+(arr[0]*1000);
		}else if(arr[0] == arr[1] || arr[0] == arr[2]) {
			result = 1000 + (arr[0] * 100);
		}else if(arr[1] == arr[2]){
			result = 1000 +(arr[1] *100);
		}else{
			Arrays.sort(arr);
			result = arr[2]*100;
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}
