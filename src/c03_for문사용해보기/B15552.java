package c03_for문사용해보기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B15552 {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		
		String[] resultAr = new String[size];
		
		for (int i=0; i<resultAr.length; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			resultAr[i] = Integer.toString(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
		
		
		for (String result : resultAr) {
			bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
	}

}
