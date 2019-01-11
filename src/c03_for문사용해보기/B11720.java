package c03_for문사용해보기;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//int[] tempAr = new int[a];
		int result = 0;
		
		String b = sc.next();
		
		for (int i=0; i<a; i++) {
			result += Integer.parseInt(b.substring(i,i+1));
		}
		System.out.println(result);
	}

}
