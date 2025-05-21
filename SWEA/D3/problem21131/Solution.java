package SWEA.D3.problem21131;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int n = sc.nextInt();

            int[][] A = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            int[][] target = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    target[i][j] = i * n + j + 1;
                }
            }

            int ops = 0;

            // 오른쪽 열부터 왼쪽으로, 필요한 경우 전치 수행
            for (int col = n-1; col >= 0; col--) {
                if (A[0][col] != target[0][col]) {
                    trans(A, col+1);
                    ops++;
                }
            }

            System.out.println(ops);
        }
    }

    // x*x 영역을 전치하는 함수
    private static void trans(int[][] A, int x) {
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }
    }
}
