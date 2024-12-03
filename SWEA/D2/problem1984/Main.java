package SWEA.D2.problem1984;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int[] num = new int[10];
            double sum = 0;

            for (int i = 0; i < 10; i++) {
                num[i] = sc.nextInt();
            }

            Arrays.sort(num);

            for (int i = 1; i < 9; i++) {
                sum += num[i];
            }
            int avg = (int)Math.round(sum/8);
            System.out.printf("#%d %d\n", tc, avg);
        }
    }
}
