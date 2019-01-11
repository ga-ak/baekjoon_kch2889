package c07_문자열사용하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tempString = br.readLine();
		
		int size = Integer.parseInt(tempString);
		String[][] resultAr = new String[size][];
		
		for (int i=0; i<size; i++) {
			tempString = br.readLine();
			StringTokenizer st = new StringTokenizer(tempString);
			int tempSize = Integer.parseInt(st.nextToken());
			String stringPointer = st.nextToken();
			
			resultAr[i] = new String[tempSize * stringPointer.length()];
			int count = 0;
			for (int j=0; j<stringPointer.length(); j++) {
				for (int k=0; k<(tempSize); k++) {
					resultAr[i][count++] = stringPointer.substring(j, j+1);
				}
			}
		}
		
		for (int i=0; i<resultAr.length; i++) {
			for (int j=0; j<resultAr[i].length; j++) {
				System.out.print(resultAr[i][j]);
			}
			System.out.println();
		}
		
	}

}
