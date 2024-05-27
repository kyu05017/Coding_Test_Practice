package 백준.입출력과_사칙연산;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Bak_01_10171_고양이 {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String re = sb.append("\\").append(" ").append(" ").append(" ").append(" ").append("/").append("\\").append("\n")
				.append(" ").append(")").append(" ").append(" ").append("(").append(" ").append("'").append(")").append("\n")
				.append("(").append(" ").append(" ").append("/").append(" ").append(" ").append(")").append("\n")
				.append(" ").append("\\").append("(").append("_").append("_").append(")").append("|").toString();
		bw.write(re);
		bw.flush();
		bw.close();
	}
}
