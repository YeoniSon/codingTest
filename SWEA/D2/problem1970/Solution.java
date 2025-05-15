package SWEA.D2.problem1970;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] money = {50000,10000,5000,1000,500,100,50,10};


        for (int tc = 1; tc <= t; tc++) {
            int change = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < money.length; i++) {
                int cnt = 0;
                sb.append(change/money[i]).append(" ");
                change %= money[i];
            }

            System.out.println("#"+tc);
            System.out.println(sb);
        }

    }
}
