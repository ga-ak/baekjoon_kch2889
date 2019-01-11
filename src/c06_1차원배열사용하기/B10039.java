package c06_1차원배열사용하기;

import java.util.Scanner;

public class B10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		
		for (int i=0; i<5; i++) {
			int temp = sc.nextInt();
			if (temp < 40) {
				temp = 40;
			}
			a[i] = temp;
		}
		
		for (int i : a) {
			sum += i;
		}
		System.out.println(sum/5);
	}

}
