package SWEA.D2.problem1983;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());

        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int t = 1; t <= tc; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            ArrayList<Double> score = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int midScore = Integer.parseInt(st.nextToken());
                int finalScore = Integer.parseInt(st.nextToken());
                int project = Integer.parseInt(st.nextToken());

                score.add((midScore * 0.35) + (finalScore * 0.45) + (project * 0.2));
            }

            double kScore = score.get(k + 1);

            score.sort(Comparator.reverseOrder());

            int div = n/10;

            int kIndex = score.indexOf(kScore);

            System.out.printf("#%d %s\n", t, grade[kIndex/div]);
        }
    }
}
