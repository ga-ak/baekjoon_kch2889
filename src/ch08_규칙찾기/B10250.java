package ch08_규칙찾기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250 {

    // ACM 호텔

    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bfr.readLine());

        String[] resultArray = new String[size];

        for (int i = 0; i < resultArray.length; i++) {
            StringTokenizer st = new StringTokenizer(bfr.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            String floor = Integer.toString(n%h);
            int roomNumber;
            String stRoomNumber = null;
            // n이 최고층 수 와 같지 않을 때는 호실에 +1 해줘야함
            if (n % h != 0) {
                roomNumber = n / h + 1;
            } else {
                roomNumber = n / h;
            }

            // 호실이 10보다 작다면 층사이에 "0"을 넣어주어야 한다
            if (roomNumber < 10) {
                stRoomNumber = "0" + Integer.toString(roomNumber);
            } else {
                stRoomNumber = Integer.toString(roomNumber);
            }

            resultArray[i] = floor + stRoomNumber;
        }

        for (String s : resultArray) {
            System.out.println(s);
        }
    }
}
