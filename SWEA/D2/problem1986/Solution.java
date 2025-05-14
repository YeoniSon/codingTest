package SWEA.D2.problem1986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum = i % 2 == 0 ? sum - i : sum + i;
            }

            System.out.printf("#%d %d\n", tc, sum);
        }
    }
}
