package BackJoon.심화1.problem25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double cnt = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                sum += 0;
            } else {
                sum += major(score, grade);
                cnt += score;
            }
        }
        System.out.printf("%.6f", sum / cnt);
    }
    static double major (double score, String grade) {

        switch (grade) {
            case "A+" : return score * 4.5;
            case "A0" : return score * 4.0;
            case "B+" : return score * 3.5;
            case "B0" : return score * 3.0;
            case "C+" : return score * 2.5;
            case "C0" : return score * 2.0;
            case "D+" : return score * 1.5;
            case "D0" : return score;
            case "F" : return score * 0.0;
            case "P" : return 0;
        }
        return score;
    }
}
