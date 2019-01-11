package c07_문자열사용하기;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] tempString = new String[2][3];
		String[] resultAr = new String[2];
		String a = "";
		
		for (int i=0; i<resultAr.length; i++) {
			resultAr[i] = "";
		}
		
		for (int i=0; i<tempString.length; i++) {
			a = sc.next();
			for (int j=0; j<a.length(); j++) {
				tempString[i][a.length()-1-j] = a.substring(j, j+1);
			}
		}
		
		for (int i=0; i<tempString.length; i++) {
			for (int j=0; j<tempString[i].length; j++) {
				resultAr[i] += tempString[i][j];
			}
		}

		String result = Integer.parseInt(resultAr[0]) > Integer.parseInt(resultAr[1]) ? resultAr[0] : resultAr[1];
		System.out.println(result);
	}

}
