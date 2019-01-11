package c03_for문사용해보기;

import java.util.Scanner;

public class B2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for (int j=0; j<(a-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
