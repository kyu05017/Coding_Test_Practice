package old.단계별풀이_old._25년_04월.복습및풀이_250420;

public class _001_심화복습_타겟넘버_Lv2_DFS {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,1,1,1,1},3));
	}
	private static int solution(int[] numbers, int target){
		return dfs("start",numbers,target,0,0,0);
	}

	private static int dfs(String task, int[] numbers, int target, int index ,int sum , int depth){
		System.out.println( "***************************************\n");
		String front = "ㅡㅡ  ".repeat(depth)+"깊이 : "+depth+"] ";
		System.out.println(front+"위치      ] : "+task);
		// 종료 조건
		if(index == numbers.length){
			System.out.println(front+"종료 가능 ] : index : "+index + " == length : "+numbers.length);
			// 타겟과 같음
			if(sum == target){
				System.out.println(front+"1반환     ] sum : "+sum+" == target : "+target);
				System.out.println( "\n***************************************\n");
				return 1;
			} else {
				System.out.println(front+"0반환     ] sum : "+sum+" != target : "+target);
				System.out.println( "\n***************************************\n");
				return 0;
			}
		} else {
			System.out.println(front+"종료 불가 ] : index : "+index + " != length : "+numbers.length);
		}
		int current = numbers[index];
		System.out.println(front+"인덱스    ] : [index] : "+index);
		System.out.println(front+"숫자 선택 ] : numbers[index] : "+current);

		System.out.println(front+"plus      ] : 시작\n");
		int plus = dfs("plus",numbers,target,index+1,sum+current,+depth+1);
		System.out.println(front+"plus      ] : 종료 결과 : "+ plus);
		System.out.println(front+"minus     ] : 시작\n");
		int minus = dfs("minus",numbers,target,index+1,sum-current,+depth+1);
		System.out.println(front+"minus     ] : 종료 결과 : "+minus);

		int result = plus+minus;
		System.out.println(front+"결과      ] : plus : "+plus + " + minus : "+minus +" = result : "+result);
		System.out.println(front+task+"      ] : 종료");
		System.out.println( "\n***************************************\n");
		return result;
	}
}
/**
log_data = [
		{"Depth": 0, "Index": 0, "Sum": 0, "Current Num": 1, "Operation": "+", "New Sum": 1},
		{"Depth": 1, "Index": 1, "Sum": 1, "Current Num": 1, "Operation": "+", "New Sum": 2},
		{"Depth": 2, "Index": 2, "Sum": 2, "Current Num": 1, "Operation": "+", "New Sum": 3},
		{"Depth": 3, "Index": 3, "Sum": 3, "Current Num": 1, "Operation": "+", "New Sum": 4},
		{"Depth": 4, "Index": 4, "Sum": 4, "Current Num": 1, "Operation": "+", "New Sum": 5},
		{"Depth": 5, "Index": 5, "Sum": 5, "Target": 3, "Result": 0},

		{"Depth": 4, "Index": 4, "Sum": 4, "Current Num": 1, "Operation": "-", "New Sum": 3},
		{"Depth": 5, "Index": 5, "Sum": 3, "Target": 3, "Result": 1},

		{"Depth": 3, "Index": 3, "Sum": 3, "Current Num": 1, "Operation": "-", "New Sum": 2},
		{"Depth": 4, "Index": 4, "Sum": 2, "Current Num": 1, "Operation": "+", "New Sum": 3},
		{"Depth": 5, "Index": 5, "Sum": 3, "Target": 3, "Result": 1},

		{"Depth": 4, "Index": 4, "Sum": 2, "Current Num": 1, "Operation": "-", "New Sum": 1},
		{"Depth": 5, "Index": 5, "Sum": 1, "Target": 3, "Result": 0},

		{"Depth": 2, "Index": 2, "Sum": 2, "Current Num": 1, "Operation": "-", "New Sum": 1},
		{"Depth": 3, "Index": 3, "Sum": 1, "Current Num": 1, "Operation": "+", "New Sum": 2},
		{"Depth": 4, "Index": 4, "Sum": 2, "Current Num": 1, "Operation": "+", "New Sum": 3},
		{"Depth": 5, "Index": 5, "Sum": 3, "Target": 3, "Result": 1},

		{"Depth": 4, "Index": 4, "Sum": 2, "Current Num": 1, "Operation": "-", "New Sum": 1},
		{"Depth": 5, "Index": 5, "Sum": 1, "Target": 3, "Result": 0},

		{"Depth": 3, "Index": 3, "Sum": 1, "Current Num": 1, "Operation": "-", "New Sum": 0},
		{"Depth": 4, "Index": 4, "Sum": 0, "Current Num": 1, "Operation": "+", "New Sum": 1},
		{"Depth": 5, "Index": 5, "Sum": 1, "Target": 3, "Result": 0},

		{"Depth": 4, "Index": 4, "Sum": 0, "Current Num": 1, "Operation": "-", "New Sum": -1},
		{"Depth": 5, "Index": 5, "Sum": -1, "Target": 3, "Result": 0},
		]
**/
