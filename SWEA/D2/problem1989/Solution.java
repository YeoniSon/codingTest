package SWEA.D2.problem1989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {
            String s = br.readLine();

            int result = 1;

            for (int i = 0; i < s.length()/2 + 1; i++) {
                if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                    result = 0;
                    break;
                }
            }

            System.out.printf("#%d %d\n", t, result);
        }
    }
}
