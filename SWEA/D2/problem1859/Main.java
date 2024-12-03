package SWEA.D2.problem1859;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t < T+1; t++) {
            int n = sc.nextInt();
            int sum = 0;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = 0;

            for (int i = n-1; i >= 0; i--) {
                if (arr[i] >= max){
                    max = arr[i];
                } else {
                    sum += (max - arr[i]);
                }
            }

            System.out.printf("#%d %d\n", t, sum);

        }
    }
}
