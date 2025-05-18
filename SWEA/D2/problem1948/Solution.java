package SWEA.D2.problem1948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int firstMonth = Integer.parseInt(st.nextToken());
            int firstDay = Integer.parseInt(st.nextToken());
            int secondMonth = Integer.parseInt(st.nextToken());
            int secondDay = Integer.parseInt(st.nextToken());

            int result = 0;

            if (firstMonth == secondMonth) {
                System.out.printf("#%d %d\n", tc, secondDay - firstDay + 1);
                continue;
            }else {
                for (int i = firstMonth; i < secondMonth; i++) {
                    result += month[i-1];
                }
                result -= firstDay;
                result += secondDay+1;
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
