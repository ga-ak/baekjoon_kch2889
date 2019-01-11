package c06_1차원배열사용하기;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		StringTokenizer st = new StringTokenizer(temp);
		int[] intAr = new int[st.countTokens()];
		int condition = 0;
		int exCondition = 0;
		
		
		for (int i=0; i<intAr.length; i++) {
			intAr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		for (int i=1; i<intAr.length; i++) {
			
			if (i == 1) {
				if(intAr[i-1] < intAr[i]) {
					condition = 1;
				} else if (intAr[i-1] > intAr[i]) {
					condition = -1;
				}
				exCondition = condition;
			} else {
				if(intAr[i-1] < intAr[i]) {
					condition = 1;
				} else if (intAr[i-1] > intAr[i]) {
					condition = -1;
				}
				if (condition != exCondition) {
					condition = 0;
					break;
				}
				exCondition = condition;
			}
			
		}
		if (condition == 1) {
			System.out.println("ascending");
		} else if (condition == -1) {
			System.out.println("descending");
		} else if (condition == 0) {
			System.out.println("mixed");
		}
	}

}
