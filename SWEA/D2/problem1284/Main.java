package SWEA.D2.problem1284;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int p = sc.nextInt(); // A사 요금;
            int q = sc.nextInt(); // B사 R리터 이하 요금
            int r = sc.nextInt(); // 리터
            int s = sc.nextInt(); // 1L당 요금;
            int w = sc.nextInt(); // 전체 리터;

            int A,B;
            int add = w - r;

            A = p*w;
            if (w <= r) {
                B = q;
            } else {
                B = q + (add*s);
            }

            System.out.printf("#%d %d\n", tc, Math.min(A, B));
        }
    }
}
