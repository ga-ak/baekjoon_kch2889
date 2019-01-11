package c08_규칙찾기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1011 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int totalSize = Integer.parseInt(br.readLine());
		int[] resultArray = new int[totalSize];
		
		for(int i=0; i<totalSize; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int inputValue = (b-a)*2-1;
			//System.out.println(a+"\t"+b+"\t"+inputValue);
			int distance = 1;

			/*while (true) {
				int temp = distance * (distance + 1) / 2;
				if (temp >= inputValue) {
					break;
				} else {

					distance++;
				}
			}*/
			distance = (int)Math.sqrt(inputValue);
			
			resultArray[i] = distance+1;
		}
		
		for(int i=0; i<totalSize; i++) {
			bw.write(resultArray[i]+"\n");
			//System.out.println(resultArray[i]);
		}
		bw.flush();
		bw.close();
	}

}
