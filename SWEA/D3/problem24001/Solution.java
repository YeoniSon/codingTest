package SWEA.D3.problem24001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String s = br.readLine();

            int distance = 0;
            int cnt = 0;
            int maxDistance = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                switch (c) {
                    case 'R':
                        distance++;
                        break;
                    case 'L':
                        distance--;
                        break;
                    case '?':
                        cnt++;
                        break;
                }

                maxDistance = Math.max(maxDistance, Math.max(Math.abs(distance - cnt), Math.abs(distance + cnt)));

            }
            System.out.println(Math.abs(maxDistance));
        }
    }
}
