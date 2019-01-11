package c06_1차원배열사용하기;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int temp = a * b * c;
		String tempString = Integer.toString(temp);
		int[] resultAr = new int[10];
		
		for (int i=0; i<tempString.length(); i++) {
			resultAr[Integer.parseInt(tempString.substring(i,i+1))]++;
		}
		for (int i : resultAr) {
			System.out.println(i);
		}
	}

}
