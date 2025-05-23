package SWEA.D3.problem16800;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            long n = sc.nextLong();

            long min = Long.MAX_VALUE;
            StringBuilder sb = new StringBuilder();

            for (int j = 1; j < n; j++) {
                if(n/j < j) break;
                if (n % j == 0) {
                    if ((n / j + j) < min) min = (n / j + j);
                }
            }

            sb.append("#" + test_case + " " + (min - 2) + "");

            System.out.println(sb);
        }
    }
}
