package SWEA.D2.problem2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();

            for (int j = 1; j <= s.length(); j++) {
                String a = s.substring(0, j);
                String b = s.substring(j, j+j);

                if (a.equals(b)) {
                    System.out.printf("#%d %d\n", i, a.length());
                    break;
                }
            }

        }
    }
}
