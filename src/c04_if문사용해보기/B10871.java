package c04_if문사용해보기;

import java.util.Scanner;

public class B10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int standard = sc.nextInt();
		int[] ar = new int[size];
		for (int i=0; i<size; i++) {
			ar[i] = sc.nextInt();
		}
		for (int i=0; i<size; i++) {
			if (ar[i] < standard) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}
