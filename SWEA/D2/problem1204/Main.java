package SWEA.D2.problem1204;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int[] score = new int[101];

            for (int i = 0; i < 1000; i++) {
                score[sc.nextInt()]++;
            }

            int max = 0;
            int idx = 0;
            for (int i = 100; i > 0 ; i--) {
                if (score[i] > max) {
                    max = score[i];
                    idx = i;
                }
            }

            System.out.printf("#%d %d\n", tc, idx);


        }
    }
}
