package 백준.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Bak_01_2557_Hello_World {

	/**
	 * 문제 Hello World!를 출력하시오
	 *
	 */
	public static void main(String[] arg) throws IOException {

		// BufferdWriter 를 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 출력
		bw.write("Hello World!");
		// 메모리 날리기와 닫기
		bw.flush();
		bw.close();

		//시스템 아웃으로 출력
		System.out.println("Hello World!");
	}
}
