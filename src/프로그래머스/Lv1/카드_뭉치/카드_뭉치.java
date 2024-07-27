package 프로그래머스.Lv1.카드_뭉치;

public class 카드_뭉치 {

	public static void main(String[] args){

		solution(new String[]{"i","drink","water"},new String[]{"want","to"},new String[]{"i", "want", "to", "drink", "water"});
	}

	public static String solution(String[] card1, String[] card2, String[] goal){

		int c1_idx = card1.length;
		int c2_idx = card2.length;
		int g1_idx = goal.length;

		int c1_task = 0;
		int c2_task = 0;
		int g1_task = 0;

		boolean re = true;

		for(String tmp : goal) {

			if(c1_task < c1_idx && tmp.equals(card1[c1_task])) {
				c1_task++;
			} else if(c2_task < c2_idx && tmp.equals(card2[c2_task])) {
				c2_task++;
			} else {
				re = false;
			}
		}

		System.out.println("1 : "+c1_task);
		System.out.println("2 : "+c2_task);
		System.out.println("re : "+re);

		return (re)?"yse":"no";
	}
}
