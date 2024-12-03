package SWEA.D2.problem1986;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum -= i;
                }else {
                    sum += i;
                }
            }

            System.out.printf("#%d %d\n", tc, sum);
        }
    }
}
