package c07_문자열사용하기;

import java.util.Scanner;

public class B5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		int result = 0;
		char[][] basket = new char[][] {
			{
				'A','B','C'
			},
			{
				'D','E','F'
			},
			{
				'G','H','I'
			},
			{
				'J','K','L'
			},
			{
				'M','N','O'
			},
			{
				'P','Q','R','S'
			},
			{
				'T','U','V'
			},
			{
				'W','X','Y','Z'
			}
		};
		
		for (int i=0; i<temp.length(); i++) {
			
			for (int j=0; j<basket.length; j++) {
				
				for (int k=0; k<basket[j].length; k++) {
					if (temp.substring(i, i+1).charAt(0) == basket[j][k]) {
						result += j+3;
						System.out.println("찾음! "+j);
						break;
					}
				}
			}
		}
		System.out.println(result);
	}

}
