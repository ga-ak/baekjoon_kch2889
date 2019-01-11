package c07_문자열사용하기;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		int[] resultAr = new int[26];
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		
		for (int i=0; i<temp.length(); i++) {
			if(temp.charAt(i)>=97 && temp.charAt(i)<=122) {
				resultAr[temp.charAt(i)-'a']++;
			} else if (temp.charAt(i) >=65 && temp.charAt(i)<=90) {
				resultAr[temp.charAt(i)-'A']++;
			}
		}
		int max = Integer.MIN_VALUE;
		int maxPointer = 0;
		for (int i =0; i<resultAr.length; i++) {
			if (resultAr[i]>max) {
				max = resultAr[i];
				maxPointer = i;
			}
		}
		int maxCount = 0;
		for (int i: resultAr) {
			if (i == max) {
				maxCount++;
			}
		}
		
		if (maxCount == 1) {
			System.out.println((char)(maxPointer+'A'));
		} else {
			System.out.println("?");
		}
		
		
	}

}
