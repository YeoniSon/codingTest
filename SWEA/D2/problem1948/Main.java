package SWEA.D2.problem1948;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            int m1, d1, m2, d2;
            m1 = sc.nextInt();
            d1 = sc.nextInt();
            m2 = sc.nextInt();
            d2 = sc.nextInt();

            HashMap<Integer, Integer> cal = new HashMap<>();
            cal.put(1, 31);
            cal.put(2, 28);
            cal.put(3, 31);
            cal.put(4, 30);
            cal.put(5, 31);
            cal.put(6, 30);
            cal.put(7, 31);
            cal.put(8, 31);
            cal.put(9,30);
            cal.put(10,31);
            cal.put(11,30);
            cal.put(12,31);

            int result = 0;

            for (int i = m1; i < m2; i++) {
                if (m1 == i) {
                    result += cal.get(i) - d1 +1;
                } else {
                    result += cal.get(i);
                }
            }
            result += d2;

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
