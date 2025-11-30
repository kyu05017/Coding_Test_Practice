package main.java.pratice.template;

import java.io.*;
import java.util.*;

public class _000_기본틀 {

    // java 코테는 입출력 세팅이 중요하다.
    // Scanner -> 느림, BufferReader -> 최소 10배는 빠르다.

    // 코테 기본 골격
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        // 예시1 : 정수 1개 입력
        int n = Integer.parseInt(br.readLine());

        System.out.println(n);

        // 예시2 : 한줄에 여러 정수 입력
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();

        System.out.println(sb.append("a : ").append(a).append(" | b : ").append(b).toString());

    }
}
