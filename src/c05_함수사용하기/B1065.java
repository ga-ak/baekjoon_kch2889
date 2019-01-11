package c05_함수사용하기;

import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int first;
		int second;
		int dif;
		int result = 0;
		
		
		for(int i=1; i<=input; i++) {
			
			dif = 10;
			String tempValue = Integer.toString(i);
			int length = tempValue.length();
			first = Integer.parseInt(tempValue.substring(0,1));
			boolean middleCheck = true;
			
			for (int j=1; j<length; j++) {
				second = Integer.parseInt(tempValue.substring(j,j+1));
				if (dif == 10) {
					dif = second - first;
				} else {
					if (dif != (second - first)) {
						middleCheck = false;
						break;
					}
				}
				first = second;
				
			}
			if (middleCheck) {
				result++;
			}
		}
			
		System.out.println(result);
	}

}
