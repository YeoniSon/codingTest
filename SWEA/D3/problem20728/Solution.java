package SWEA.D3.problem20728;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] candy = new int[n];

            for (int i = 0; i < n; i++) {
                candy[i] = sc.nextInt();
            }

            Arrays.sort(candy);

            int min = Integer.MAX_VALUE;

            for (int i = 0; i <= n-k; i++) {
                int dif = (candy[i+k-1]-candy[i]);
                min = Math.min(min, dif);
            }

            System.out.printf("#%d %d\n", tc, min);
        }
    }
}
