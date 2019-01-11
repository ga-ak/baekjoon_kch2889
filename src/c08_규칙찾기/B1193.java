package c08_규칙찾기;

import java.util.Scanner;

public class B1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int di = 1;
		int n = sc.nextInt();
		boolean once = true;
		
		for (int i = 1; i < n; i++) {
			if ((a == 1 || b == 1) && once) {
				di *= -1;
				if (di == 1) {
					a++;
				} else if (di == -1) {
					b++;
				}
				once = false;
			} else {
				if (di == 1) {
					b++;
					a--;
				} else if (di ==-1) {
					b--;
					a++;
				}
				once = true;
			}
			//System.out.println(i+1+"번째 >> "+a + "/" + b);
		}

		System.out.println(a + "/" + b);
	}

}
