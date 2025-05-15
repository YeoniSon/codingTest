package SWEA.D2.problem1976;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int aHour = Integer.parseInt(st.nextToken());
            int aMinute = Integer.parseInt(st.nextToken());
            int bHour = Integer.parseInt(st.nextToken());
            int bMinute = Integer.parseInt(st.nextToken());

            int sumHour = aHour + bHour;
            int sumMinute = aMinute + bMinute;

            if (sumHour > 12) {
                sumHour %= 12;
            }
            if (sumMinute > 59) {
                sumMinute %= 60;
                sumHour++;
            }

            System.out.printf("#%d %d %d\n", tc, sumHour, sumMinute);
        }
    }

}
