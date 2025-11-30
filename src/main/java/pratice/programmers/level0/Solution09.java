package main.java.pratice.programmers.level0;

/*
 * 🟠 문제 9 — 행렬의 덧셈
 * 입력 예시: [ [1,2], [3,4] ][ [5,6], [7,8] ]
 * 출력 예시: [ [6,8], [10,12] ]
 *
 * 🎯 포인트
 * 2차원 배열
 * 중첩 for문
 * 같은 index끼리 더하기
 * */
public class Solution09 {
	
	public static void main(String[] args){
		
		int[][] arr1 = {{1,2},{3,4}};
		int[][] arr2 = {{5,6},{7,8}};
		
		int[][] result = addMatrix(arr1,arr2);
		
		for (int[] ints : result) {
			for (int j = 0; j < result.length; j++) {
				System.out.println(ints[j]);
			}
		}
	}
	
	public static int[][] addMatrix(int[][] a, int[][] b) {
		int[][] result = new int[][]{{0,0},{0,0}};
		if(a == null || a.length == 0 || b == null || b.length == 0) return result;
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++) result[i][j] = a[i][j] + b[i][j];
		}
		
		return result;
	}
}
