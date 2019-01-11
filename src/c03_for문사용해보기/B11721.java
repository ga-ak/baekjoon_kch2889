package c03_for문사용해보기;

import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int count = 0;
		char[] tempCharAr = new char[10];
		for (int i=0; i<a.length();i++) {
			
			tempCharAr[count++] = a.charAt(i);
			if (count == tempCharAr.length) {
				for (char c:tempCharAr) {
					System.out.print(c);
				}
				System.out.println();
				count = 0;
			}
			//count++;
		}
		
		if(count != 0) {
			for (int i=0; i<count; i++) {
				System.out.print(tempCharAr[i]);
			}
		}

	}

}
