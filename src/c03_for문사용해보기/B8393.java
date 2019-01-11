package c03_for문사용해보기;

import java.util.Scanner;

public class B8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		for (int i=1; i<=a; i++) {
			result += i;
		}
		
		System.out.println(result);
	}

}
