package SWEA.D3.problem18662;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            double x1 = Math.abs(a + c - 2.0 * b) / 2.0;
            double x2 = Math.abs(2.0 * b - a - c) / 2.0;
            double x3 = Math.abs(2.0 * b - a - c) / 2.0;

            double result = Math.min(x1, Math.min(x2, x3));
            System.out.printf("#%d %.1f\n", test_case, result);
        }
    }
}
