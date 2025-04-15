package 단계별풀이._25년_04월.복습및풀이_250408;

public class _004_P와Y비교 {
	public static void main(String[] args) {

	}

	private static boolean solution(String s){
		int answer = 0;

		String[] temp = s.toLowerCase().split("");
		int cntP = 0;
		int cntY = 0;

		for(int i = 0; i < temp.length; i++){
			if(temp[i].equals("p")){
				cntP++;
			}else if(temp[i].equals("y")){
				cntY++;
			}
		}
		return (cntP == cntY);
	}
}
