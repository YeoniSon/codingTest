package SWEA.D2.problem1983;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int tc = 1; tc < T+1; tc++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Double> student = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                int mid, fin, pro;
                mid = sc.nextInt();
                fin = sc.nextInt();
                pro = sc.nextInt();

                double grade = (mid * 0.35) + (fin * 0.45) + (pro*0.2);

                student.add(grade);
            }
            double k_score = student.get(k-1);

            student.sort(Comparator.reverseOrder());

            int div = n / 10;

            int k_index = student.indexOf(k_score);

            System.out.printf("#%d %s\n", tc, score[k_index/div]);

        }
    }
}
