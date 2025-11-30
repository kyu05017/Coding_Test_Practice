package 단계별풀이_old.연습.백준.입출력과_사칙연산;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Bak_01_10172_개 {
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String re = sb 
				.append("|").append("\\").append("_").append("/").append("|").append("\n")
				.append("|").append("q").append(" ").append("p").append("|").append(" ").append(" ").append(" ").append("/").append("}").append("\n")
				.append("(").append(" ").append("0").append(" ").append(")").append("\"").append("\"").append("\"").append("\\").append("\n")
				.append("|").append("\"").append("^").append("\"").append("`").append(" ").append(" ").append(" ").append(" ").append("|").append("\n")
				.append("|").append("|").append("_").append("/").append("=").append("\\").append("\\").append("_").append("_").append("|").toString();

		bw.write(re);
		bw.flush();
		bw.close();
	}
}
