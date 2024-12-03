package SWEA.D2.problem1976;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int h1, m1, h2, m2;
            h1 = sc.nextInt();
            m1 = sc.nextInt();
            h2 = sc.nextInt();
            m2 = sc.nextInt();

            int hour = h1 + h2;
            int minute = m1 + m2;

            if (minute >= 60){
                hour++;
                minute -= 60;
            }

            if (hour > 12) {
                hour -= 12;
            }

            System.out.printf("#%d %d %d\n", tc, hour, minute);
        }
    }
}
