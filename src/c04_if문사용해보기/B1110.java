package c04_if문사용해보기;

import java.util.Scanner;

public class B1110 {
	static void separate(int origin, int[]a) {
		a[0] = origin/10;
		a[1] = origin - (origin/10*10);
	}
	static int arSum(int[] a) {
		int[] temp = new int[2];
		separate(a[0]+a[1],temp);
		return a[1]*10+temp[1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int origin = sc.nextInt();
		int newValue;
		int count = 1;
		int[] a = new int[2];
		separate(origin,a);
		newValue = arSum(a);
		//System.out.println(newValue);
		while(origin != newValue) {
			separate(newValue,a);
			newValue = arSum(a);
			//System.out.println(newValue);
			count++;
		}
		System.out.println(count);

	}

}
