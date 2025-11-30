package 단계별풀이_old.연습.완전탐색;

public class _001_패턴반복연습_1 {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = {-1,-2,-3,-4,-5};

		for(int i = 0; i < a.length; i++){
			int idx = i % b.length;
			System.out.print("a : "+a[i]);
			System.out.print("  b :"+ b[idx]+"\n");
		}
	}
}
