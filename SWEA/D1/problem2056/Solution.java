package SWEA.D1.problem2056;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        int[] lim = {31, 28,31,30,31,30,31,31,30,31,30,31};

        for (int t = 1; t <= tc; t++) {
            String s = br.readLine();

            int year = Integer.parseInt(s.substring(0, 4));
            int month = Integer.parseInt(s.substring(4, 6));
            int day = Integer.parseInt(s.substring(6, 8));

            if ((month < 1 || month > 12)|| (day < 1 || day > lim[month-1]) ) {
                System.out.println("#"+t+ " " + -1);
            }else {
                System.out.printf("#%d %04d/%02d/%02d\n",t, year, month, day);
            }
        }
    }
}
