package c02_사칙연산도전하기;

import java.util.Scanner;

public class B2839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputedNum = sc.nextInt();
        int result = -1;
        int a = inputedNum / 5;
        int b = inputedNum / 3;

        int[] resultArr = new int[b];
        for(int i =0; i<resultArr.length; i++) {
            resultArr[i] = Integer.MAX_VALUE;
        }
        int count = 0;
        for (int i = 0; i<=a; i++) {
            for (int j =0; j<=b; j++) {
                if(i*5 + j*3 == inputedNum) {
                    resultArr[count++] = i+j;
                }
            }
        }

		/*for(int i : resultArr) {
			System.out.print(i+" ");
		}
		System.out.println();*/
        if(resultArr[0] == Integer.MAX_VALUE) {
            result = -1;
        } else {
            int minNum = Integer.MAX_VALUE;
            for (int i=0; i<resultArr.length; i++) {
                if (resultArr[i] < minNum) {
                    minNum = resultArr[i];
                }

            }
            result = minNum;
        }
        System.out.println(result);


    }

}
