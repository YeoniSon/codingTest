package SWEA.D1.problem2068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t < T + 1; t++) {
            int max = 0;
            for (int i = 0; i < 10; i++) {
                int n = sc.nextInt();
                if (max < n) {
                    max = n;
                }
            }
            System.out.printf("#%d %s\n",t,max);
        }
    }
}
