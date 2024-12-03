package SWEA.D2.problem1959;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = 0;

            int[] nNum = new int[n];
            int[] mNum = new int[m];

            for (int i = 0; i < n; i++) {
                nNum[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                mNum[i] = sc.nextInt();
            }

            for (int i = 0; i <= Math.abs(n-m); i++) {
                int sum = 0;
                for (int j = 0; j < Math.min(n,m); j++) {
                    if (n > m){
                        sum += nNum[i+j] * mNum[j];
                    } else {
                        sum += nNum[j] * mNum[i + j];
                    }
                }
                result = Math.max(result, sum);
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
