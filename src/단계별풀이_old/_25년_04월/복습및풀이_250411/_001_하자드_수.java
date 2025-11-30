package 단계별풀이_old._25년_04월.복습및풀이_250411;

public class _001_하자드_수 {

	public static void main(String[] args) {
		System.out.println();
	}
	private static boolean solution(int x){

		String[] arr = String.valueOf(x).split("");
		int tmp = 0;
		for(int i = 0; i < arr.length;i++){
			tmp += Integer.parseInt(arr[i]);
		}
		return (tmp%x==0);
	}

	private static boolean solution2(int x){
		return x%(String.valueOf(x).chars().map(c -> c - '0').sum())==0;
	}
}
