package c04_if문사용해보기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B9498 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result = Integer.parseInt(br.readLine());
		if (result >= 90) {
			bw.write("A");
		} else if (result >= 80) {
			bw.write("B");
		} else if (result >= 70) {
			bw.write("C");
		} else if (result >= 60) {
			bw.write("D");
		} else {
			bw.write("F");
		}
		bw.flush();
		bw.close();
	}

}
