package c05_함수사용하기;

import java.util.HashSet;

public class B4673 {
	static HashSet<Integer> hs = new HashSet<>();
	
	static int selfNumCal(int num) {
		String temp = Integer.toString(num);
		int[] resultAr = new int[temp.length()];
		for (int i=0; i<temp.length(); i++) {
			num += Integer.parseInt(temp.substring(i,i+1));
		}
		hs.add(num);
		return num;
	}
	public static void main(String[] args) {
		for (int i=1; i<=10000; i++) {
			selfNumCal(i);
			if(!hs.contains(i)) {
				
				System.out.println(i);
			}
		}
	}

}
