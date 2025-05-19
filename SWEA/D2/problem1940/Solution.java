package SWEA.D2.problem1940;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int speed = 0;
            int distance = 0;

            for (int i = 0; i < N; i++) {
                int command = sc.nextInt();

                switch (command) {
                    case 0:
                        break;
                    case 1:
                        speed += sc.nextInt();
                        break;
                    case 2:
                        speed -= sc.nextInt();
                        break;
                }
                if (speed < 0)speed = 0;
                distance += speed;
            }
            System.out.printf("#%d %d\n", tc, distance);
        }
    }
}
