package SWEA.D3.problem19185;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String[] S = new String[n];
            String[] T = new String[m];

            for (int i = 0; i < n; i++) {
                S[i] = sc.next();
            }
            for (int i = 0; i < m; i++) {
                T[i] = sc.next();
            }

            int Q = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            sb.append("#").append(test_case).append(" ");

            for (int i = 0; i < Q; i++) {
                int year = sc.nextInt() -1 ;
                int sNum = year % n;
                int tNum = year % m;

                sb.append(S[sNum]).append(T[tNum]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }
}
