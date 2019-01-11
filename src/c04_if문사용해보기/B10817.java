package c04_if문사용해보기;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B10817 {
	
	static void swap (int[] ar, int a, int b) {
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		StringTokenizer st = new StringTokenizer(temp);
		int[] a = new int[st.countTokens()];
		int[] result = new int[a.length];
		
		for (int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-i-1; j++) {
				if (a[j] < a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
		
		System.out.println(a[1]);
		
	}

}
