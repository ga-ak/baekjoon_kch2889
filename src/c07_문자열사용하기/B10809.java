package c07_문자열사용하기;

import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tempString = sc.nextLine();
		int[] resultAr = new int[26];
		
		for (int i=0; i<resultAr.length; i++) {
			resultAr[i] = -1;
		}
		
		
		for (int i=0; i<tempString.length(); i++) {
			//System.out.println(tempString.indexOf(tempString.substring(i,i+1)));
			int temp = tempString.substring(i,i+1).charAt(0);
			if (resultAr[temp-'a'] == -1) {
				resultAr[temp-'a'] = tempString.indexOf(tempString.substring(i,i+1));
			}
		}
		for (int i : resultAr) {
			System.out.println(i);
		}

	}

}
