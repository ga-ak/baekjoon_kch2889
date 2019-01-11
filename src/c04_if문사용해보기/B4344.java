package c04_if문사용해보기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalSize = Integer.parseInt(br.readLine());
		double[] resultAr = new double[totalSize];
		
		for(int i=0; i<totalSize; i++) {
			String tempData = br.readLine();
			StringTokenizer st = new StringTokenizer(tempData);
			int tempSize = Integer.parseInt(st.nextToken());
			double[] tempAr = new double[tempSize];
			double avg = 0;
			int count = 0;
			
			for(int j=0; j<tempSize; j++) {
				tempAr[j] = Integer.parseInt(st.nextToken());
				avg += tempAr[j];
			}
			avg = avg/tempSize;
			
			for(int k=0; k<tempSize; k++) {
				if(tempAr[k]>avg) {
					count++;
				}
			}
			
			resultAr[i] = (double)count / tempSize *100;
			
		}
		
		for(int i=0; i<totalSize; i++) {
			
			System.out.println(String.format("%.3f", resultAr[i])+'%');
		}
	}

}
