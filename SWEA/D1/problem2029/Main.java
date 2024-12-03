package SWEA.D1.problem2029;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t < T+1; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("#%d %d %d\n", t, a/b, a%b);
        }
    }
}
