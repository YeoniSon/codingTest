package SWEA.D2.problem2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T + 1; tc++) {
            int n,m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] map = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int max = 0;

            for (int si = 0; si < n-m+1; si++) {
                for (int sj = 0; sj < n-m+1; sj++) {
                    int cnt = 0;
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < m; j++) {
                            cnt += map[si+i][sj+j];
                        }
                    }
                    if (max < cnt){
                        max = cnt;
                    }
                }
            }
            System.out.printf("#%d %d\n", tc, max);


        }
    }
}
