package SWEA.D1.problem2072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i < T+1; i++) {
            int sum = 0;

            for (int j = 0; j < 10; j++) {
                int n = sc.nextInt();
                if (n % 2 != 0) {
                    sum += n;
                }
            }

            System.out.printf("#%d %d\n", i, sum);
        }
    }
}
