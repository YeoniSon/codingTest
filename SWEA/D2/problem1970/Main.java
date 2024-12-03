package SWEA.D2.problem1970;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int[] change = new int[money.length];

            for (int i = 0; i < change.length; i++) {
                change[i] = n / money[i];
                n = n % money[i];
            }

            System.out.println("#"+ tc);
            for (int i = 0; i < change.length; i++) {
                System.out.printf("%d ", change[i]);
            }
            System.out.println();


        }
    }
}
