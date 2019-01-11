package c08_규칙찾기;

import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int inputValue = sc.nextInt();
			int distance = 0;
			int sum = 1;
			while (true) {

				if (inputValue > (distance * 6) + sum) {
					sum += distance * 6;
					distance++;
				} else {
					break;
				}
			}
			System.out.println(distance+1);
		
	}

}
