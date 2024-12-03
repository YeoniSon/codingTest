package SWEA.D2.problem1979;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n,k;
            n = sc.nextInt();
            k = sc.nextInt();

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int totalCnt = 0;

            for (int i = 0; i < n; ++i) {
                int cnt = 0;
                for (int j = 0; j < n; ++j) {
                    if (arr[i][j] == 1){
                        cnt++;
                    } else {
                        if (cnt == k) {
                            totalCnt++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                    totalCnt++;
                }
            }

            for (int j = 0; j < n; ++j) {
                int cnt = 0;
                for (int i = 0; i < n; ++i) {
                    if (arr[i][j] == 1){
                        cnt++;
                    } else {
                        if (cnt == k) {
                            totalCnt++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == k) {
                    totalCnt++;
                }
            }
            System.out.printf("#%d %d\n", tc, totalCnt);
        }
    }
}
