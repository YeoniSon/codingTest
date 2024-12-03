package SWEA.D2.problem1989;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc < T+1; tc++) {
            String s = sc.next();
            int result = 1;

            for (int i = 0; i < s.length()/2+1; i++) {
                if (s.charAt(i) != s.charAt(s.length()-i-1)){
                    result = 0;
                    break;
                }
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
