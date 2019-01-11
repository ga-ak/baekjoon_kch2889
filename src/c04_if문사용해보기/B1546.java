package c04_if문사용해보기;

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double[] intAr = new double[size];
		double maxValue = Integer.MIN_VALUE;
		double sum = 0;
		for (int i=0; i<size; i++) {
			intAr[i] = sc.nextInt();
			if (intAr[i]>maxValue) {
				maxValue = intAr[i];
			}
			
		}
		
		
		for (int i=0; i<size; i++) {
			intAr[i] = intAr[i]/maxValue*100;
			sum += intAr[i];
		}
		
		System.out.println(sum/size);
	}

}
