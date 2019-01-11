package c06_1차원배열사용하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B8958 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int length = Integer.parseInt(temp);
		int[] resultAr = new int[length];
		
		for (int i=0; i<length; i++) {
			temp = br.readLine();
			int tempLength = temp.length();
			char[] tempChAr = new char[tempLength];
			tempChAr = temp.toCharArray();
			int score = 0;
			int tempScore = 0;
			
			for (int j=0; j<tempChAr.length; j++) {
				if (tempChAr[j] == 'O') {
					tempScore++;
					score += tempScore;
				} else if (tempChAr[j] == 'X') {
					tempScore = 0;
				}
			}
			resultAr[i] = score;
		}
		
		for (int i : resultAr) {
			System.out.println(i);
		}
		
	}

}
