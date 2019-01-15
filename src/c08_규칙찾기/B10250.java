package c08_규칙찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250 {

    // ACM 호텔

    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bfr.readLine());
        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++) {
            String tempString = bfr.readLine();
            StringTokenizer st = new StringTokenizer(tempString);
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

//            int h = 6;
//            int w = 10;
//            int n = i+1;
//
            String floor;
            String roomNum;

            if (n % h == 0) {
                floor = Integer.toString(h);
                if (n / h < 10) {
                    roomNum = "0" + Integer.toString(n / h);
                } else {
                    roomNum = Integer.toString(n / h);
                }
            } else {
                floor = Integer.toString(n % h);
                if (n / h < 10-1) {
                    roomNum = "0" + Integer.toString(n / h+1);
                } else {
                    roomNum = Integer.toString(n / h+1);
                }
            }

            resultArray[i] = Integer.parseInt(floor+roomNum);

        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }
}
