package SWEA.D2.problem2007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t < T+1; t++) {
            String s = sc.next();
            for (int i = 1; i <= s.length(); i++) {
                String a = s.substring(0, i);
                String b = s.substring(i, i+i);
                if (a.equals(b)){
                    System.out.printf("#%d %d\n", t, a.length());
                    break;
                }
            }
        }
    }
}