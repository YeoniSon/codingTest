package SWEA.D1.problem2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int lim[] = {31,28,31,30,31,30,31,30,31,31,30,31,30,31};

        for (int t = 1; t < T+1; t++) {
            String s = sc.next();
            int year = Integer.parseInt(s.substring(0,4));
            int month = Integer.parseInt(s.substring(4,6));
            int day = Integer.parseInt(s.substring(6,8));

            if ((month < 1 || month > 12) || (day < 1 || day > lim[month-1])){
                System.out.printf("#%d -1\n", t);
            }else {
                System.out.printf("#%d %04d/%02d/%02d\n", t, year, month, day);
            }
        }
    }
}
