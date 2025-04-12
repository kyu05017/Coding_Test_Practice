package 단계별풀이.연습.Lv1.공원산책;

import java.util.Arrays;

public class 공원산책 {
	public static void main(String[] args){
		System.out.println(Arrays.toString(sol4(new String[]{"SOOXO", "OOOXO", "OXOOO", "XOOOO"}, new String[]{"E 2", "S 2", "W 2", "S 1", "W 1"})));
	}
	private static int[] sol2(String[] park, String[] routes){
		int[] answer = new int[2];

		// 공원의 최대값 구하기 (인덱스 기준 0부터 시작을 준수)
		int max_park_x = park[0].length()-1;
		int max_park_y = park.length-1;

		// 가로방향이동, 세로방향이동에 대한 배열 준비
		String[] move_y = new String[max_park_x+1];

		for(int i = 0; i < park[0].length(); i++){
			StringBuilder m = new StringBuilder();
			for (String s : park) {
				m.append(s.split("")[i]);
			}
			move_y[i] = m.toString();
		}

		// 시작위치 구하기 -> answer 에 임시저장
		for(int i = 0; i < park.length;i++){
			String[] x = park[i].split("");
			int j = 0;
			while(j < x.length){
				if(x[j].equals("S")){
					answer[1] = i;
					answer[0] = j;
				}
				j++;
			}
		}
		//이동
		for (String route : routes) {
			System.out.println("-------------------------------");
			String[] r = route.split(" ");
			String d = r[0];
			// 사용할 방향
			String[] useD = ((d.equals("N") || d.equals("S"))) ? move_y : park;
			int m = (d.equals("W") || d.equals("N")) ? Integer.parseInt(r[1]) * -1 : Integer.parseInt(r[1]);
			int now = ((d.equals("N") || d.equals("S"))) ? answer[0] : answer[1];
			int now_d = ((d.equals("N") || d.equals("S"))) ? answer[0] : answer[1];

			// 이동전 검사
			// 1. 공원 벗어나는 경우
			now_d += m;
			if (now_d < 0 || now_d > useD.length) {
				continue;
			}

			// 2. 방해물이 있는 경우
			boolean isOkay = true;
			int tmp = ((d.equals("N") || d.equals("S"))) ? answer[1] : answer[0];
			String[] dd = useD[tmp].split("");
			if(now_d > 0 ){ // +
				for(int i = now; i <= now_d;i++){
					if(dd[i].equals("X")){
						isOkay = false;
					}
				}
			} else { // -
				for(int i = now; i > 0;i--){
					if(dd[i].equals("X")){
						isOkay = false;
					}
				}
			}

			if(isOkay){
				if(d.equals("N") || d.equals("S")){
					answer[0] += m;
				} else {
					answer[1] += m;
				}
			}

		}
		return answer;
	}
	private static int[] sol(String[] park, String[] routes){
		int[] answer = new int[2];

		// 공원의 최대값 구하기 (인덱스 기준 0부터 시작을 준수)
		int max_park_x = park[0].length()-1;
		int max_park_y = park.length-1;

		System.out.println("공원의 가로길이 최대값 : "+ max_park_x);
		System.out.println("공원의 세로길이 최대값 : "+ max_park_y);

		// 가로방향이동, 세로방향이동에 대한 배열 준비
		String[] move_y = new String[max_park_x+1];

		for(int i = 0; i < park[0].length(); i++){
			StringBuilder m = new StringBuilder();
			for (String s : park) {
				m.append(s.split("")[i]);
			}
			move_y[i] = m.toString();
		}
		System.out.println("x방향 :"+Arrays.toString(park));
		System.out.println("y방향 :"+Arrays.toString(move_y));

		// 시작위치 구하기 -> answer 에 임시저장
		for(int i = 0; i < park.length;i++){
			String[] x = park[i].split("");
			int j = 0;
			while(j < x.length){
				if(x[j].equals("S")){
					answer[1] = i;
					answer[0] = j;
				}
				j++;
			}
		}
		//이동
		System.out.println("\n 이동 시작");
		for (String route : routes) {
			System.out.println("-------------------------------");
			String[] r = route.split(" ");
			String d = r[0];
			// 사용할 방향
			String[] useD = ((d.equals("N") || d.equals("S"))) ? move_y : park;
			int m = (d.equals("W") || d.equals("N")) ? Integer.parseInt(r[1]) * -1 : Integer.parseInt(r[1]);
			int now = ((d.equals("N") || d.equals("S"))) ? answer[0] : answer[1];
			int now_d = ((d.equals("N") || d.equals("S"))) ? answer[0] : answer[1];

			// 이동전 검사
			System.out.println("현재위치 x : "+ answer[1] + " y : "+ answer[0]);
			System.out.println("방향 : " + d + " | 거리 : " + m);
			System.out.println("지도 :" + Arrays.toString(useD));
			// 1. 공원 벗어나는 경우
			now_d += m;
			if (now_d < 0 || now_d > useD[0].split("").length) {
				continue;
			}

			// 2. 방해물이 있는 경우
			boolean isOkay = true;
			int tmp = ((d.equals("N") || d.equals("S"))) ? answer[1] : answer[0];
			String[] dd = useD[tmp].split("");
			System.out.println("진행방향 : "+Arrays.toString(dd));
			if(now_d > 0 ){ // +
				for(int i = now; i <= now_d;i++){
					System.out.print("\n+이동");
					System.out.print("now : "+i+" now_d : ["+ dd[i]+"]");
					if(dd[i].equals("X")){
						isOkay = false;
					}
				}
			} else { // -
				for(int i = now; i > 0;i--){
					System.out.print("\n-이동");
					System.out.print("now : "+i+" now_d : ["+ dd[i]+"]");
					if(dd[i].equals("X")){
						isOkay = false;
					}
				}
			}
			System.out.println();

			System.out.println("통과 \n");

			if(isOkay){
				if(d.equals("N") || d.equals("S")){
					answer[0] += m;
				} else {
					answer[1] += m;
				}
			}

			System.out.println("이동위치 x : "+ answer[1] + " y : "+ answer[0]);
			System.out.println("-------------------------------");
		}
		System.out.println("이동 끝\n");
		return answer;
	}
	private static int[] sol3(String[] park, String[] routes) {
		System.out.println("----------------------------------------------------");
		int[] answer = new int[2];

		int v = 0;
		int h = 0;

		// 공원 크기
		int max_v = park.length;
		int max_h = park[0].length();
		System.out.println("공원 크기 max_vertical : "+max_v + " max_horizon : "+ max_h);
		System.out.println("----------------------------------------------------");
		// 시작위치
		for(int i = 0; i < park.length; i++){
			if(park[i].contains("S")){
				v = i;
				h = park[i].indexOf("S");
			}
		}
		System.out.println("시작 위치 vertical : "+v + " horizon : "+ h);
		System.out.println("----------------------------------------------------");

		// 이동
		for(int i = 0; i < routes.length; i++) {
			System.out.println("----------------------------------------------------");
			System.out.println(i + "번");
			String direction = routes[i].split(" ")[0];
			int movement = Integer.parseInt(routes[i].split(" ")[1]);

			System.out.println("방향 : " + direction + "| 거리 : " + movement);


			String now_position_map = park[v];
			System.out.println("현재 Vertical 기준 : " + now_position_map);
			// 좌우이동
			if(direction.equals("E") || direction.equals("W")){
				if (isOver(direction, h, movement, max_h)) {
					if (direction.equals("E")){
						for(int j = h; j < movement;j++){
							String[] sss = park[v].split("");
							System.out.println(sss[j]);
						}
					} else {

					}
				} else {
					System.out.println("horizon 초과");
				}
			} else {// 세로이동
				if (isOver(direction, v, movement, max_v)) {
					if (direction.equals("S")){

					} else {

					}
				} else {
					System.out.println("vertical 초과");
				}
			}
			System.out.println("----------------------------------------------------");
		}
		return answer;
	}
	private static boolean isOver(String direction, int now, int move,int max){
		int temp_now = (direction.equals("N") || direction.equals("W") ? (move *= -1)+now : move+now);
		return temp_now < 0 || temp_now > max;
	}

	private static int[] sol4(String[] park, String[] routes){
						// v,h
		int[] answer = {0,0};

		String[][] temp = new String[park.length][park[0].length()];

		// 전체크기 대입 & // 시작위치 찾기
		for(int i = 0; i < temp.length; i++){
			char[] tmp = park[i].toCharArray();
			for(int j = 0; j < tmp.length;j++) {
				temp[i][j] = tmp[j]+"";
				if(temp[i][j].equals("S")){
					answer[0] = i;
					answer[1] = j;
				}
			}
		}

		// 확인용
		System.out.println("----------------------------");
		for (String[] strings : temp) {
			for (String s : strings) {
				System.out.print(" ["+s+"] ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		int v = temp.length;
		int h = temp[0].length;

		System.out.println("가로 최대 크기 0 ~ "+h + " \n세로 최대 크기 0 ~ "+v);
		System.out.println("----------------------------");
		System.out.println("시작 위치 :"+Arrays.toString(answer));
		// 이동
		for(int i = 0; i < routes.length;i++){
			System.out.println("----------------------------");
			System.out.println(i+"회");
			System.out.println("현재 위치 :"+Arrays.toString(answer));
			String d = routes[i].split(" ")[0];
			int m = Integer.parseInt(routes[i].split(" ")[1]);

			System.out.println("방향 : "+d);
			System.out.println("거리 : "+m);

			boolean isOkay = true;
			// 동
			if(d.equals("E")) {
				if ((answer[1] + m) > h - 1) {
					System.out.println("공원을 벗어남!");
					continue;
				}
				for (int j = answer[1]; j < h; j++) {
					if (temp[answer[0]][j].equals("X")) {
						if(answer[1]+m >= j){
							System.out.println("장애물!!");
							isOkay = false;
						}
					}
				}
				if(isOkay){
					answer[1] += m;
				}
			}
			// 서
			else if(d.equals("W")){
				if((answer[1] + (m*-1)) < 0){
					System.out.println("공원을 벗어남!");
					continue;
				}
				for (int j = answer[1]; j >= 0 ; j--) {
					if (temp[answer[0]][j].equals("X")) {
						if((answer[1] + (m*-1)) <= j){
							System.out.println("장애물!!");
							isOkay = false;
						}

					}
				}
				if(isOkay) {
					answer[1] -= m;
				}
			}
			// 남
			else if(d.equals("S")){
				if((answer[0] + m) > v-1){
					System.out.println("공원을 벗어남!");
					continue;
				}
				for(int j = answer[0];j<v;j++){
					if(temp[j][answer[1]].equals("X")){
						if((answer[0] + m) >= j){
							System.out.println("장애물!!");
							isOkay = false;
						}
					}
				}
				if(isOkay) {
					answer[0] += m;
				}
			}
			// 북
			else if(d.equals("N")){
				if((answer[0] + (m*-1)) < 0){
					System.out.println("공원을 벗어남!");
					continue;
				}

				for(int j = answer[0]; j >= 0; j--){
					if(temp[j][answer[1]].equals("X")){
						if((answer[0] + (m*-1)) <= j){
							System.out.println("장애물!!");
							isOkay = false;
						}
					}
				}
				if(isOkay) {
					answer[0] -= m;
				}
			}
			System.out.println("----------------------------");
		}
		return answer;
	}
	private static int[] sol5(String[] park, String[] routes){
		// v,h
		int[] answer = {0,0};

		String[][] temp = new String[park.length][park[0].length()];

		// 전체크기 대입 & // 시작위치 찾기
		for(int i = 0; i < temp.length; i++){
			char[] tmp = park[i].toCharArray();
			for(int j = 0; j < tmp.length;j++) {
				temp[i][j] = tmp[j]+"";
				if(temp[i][j].equals("S")){
					answer[0] = i;
					answer[1] = j;
				}
			}
		}

		// 좌우크기 채번
		int v = temp.length;
		int h = temp[0].length;

		// 이동
		for (String route : routes) {
			String d = route.split(" ")[0];
			int m = Integer.parseInt(route.split(" ")[1]);

			boolean isOkay = true;
			// 동
			if (d.equals("E")) {
				if ((answer[1] + m) > h - 1) {
					continue;
				}
				for (int j = answer[1]; j < h; j++) {
					if (temp[answer[0]][j].equals("X")) {
						if (answer[1] + m >= j) {
							isOkay = false;
						}
					}
				}
				if (isOkay) {
					answer[1] += m;
				}
			} else if (d.equals("W")) {
				if ((answer[1] + (m * -1)) < 0) {
					continue;
				}
				for (int j = answer[1]; j >= 0; j--) {
					if (temp[answer[0]][j].equals("X")) {
						if ((answer[1] + (m * -1)) <= j) {
							isOkay = false;
						}

					}
				}
				if (isOkay) {
					answer[1] -= m;
				}
			} else if (d.equals("S")) {
				if ((answer[0] + m) > v - 1) {
					continue;
				}
				for (int j = answer[0]; j < v; j++) {
					if (temp[j][answer[1]].equals("X")) {
						if ((answer[0] + m) >= j) {
							isOkay = false;
						}
					}
				}
				if (isOkay) {
					answer[0] += m;
				}
			} else if (d.equals("N")) {
				if ((answer[0] + (m * -1)) < 0) {
					continue;
				}

				for (int j = answer[0]; j >= 0; j--) {
					if (temp[j][answer[1]].equals("X")) {
						if ((answer[0] + (m * -1)) <= j) {
							isOkay = false;
						}
					}
				}
				if (isOkay) {
					answer[0] -= m;
				}
			}
		}
		return answer;
	}
}
