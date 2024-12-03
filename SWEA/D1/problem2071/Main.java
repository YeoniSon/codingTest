package SWEA.D1.problem2071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t < T+1; t++) {
            double sum = 0;
            double avg = 0;
            for (int i = 0; i < 10; i++) {
                sum += sc.nextInt();
            }
            avg = sum/10;
            System.out.println("#" + t + " " + Math.round(avg));
        }
    }
}
