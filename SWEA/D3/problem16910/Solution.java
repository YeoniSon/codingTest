package SWEA.D3.problem16910;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();

            int cnt = 0;

            for (int i = -n; i <= n; i++) {
                for (int j = -n; j <= n; j++) {
                    if (i * i + j * j <= n * n) {
                        cnt++;
                    }
                }
            }
            System.out.printf("#%d %d\n", test_case, cnt);
        }
    }
}
