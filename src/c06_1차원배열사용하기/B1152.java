package c06_1차원배열사용하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputValue = br.readLine();
		StringTokenizer st = new StringTokenizer(inputValue);
		System.out.println(st.countTokens());

	}

}
