package SWEA.D2.problem1945;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] arr = {2,3,5,7,11};

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            sb.append("#").append(tc).append(" ");

            for (int i = 0; i < arr.length; i++) {
                int cnt = 0;
                while(n % arr[i] == 0) {
                    if (n % arr[i] == 0) {
                        cnt++;
                        n /= arr[i];
                    }
                }
                sb.append(cnt).append(" ");
            }
            System.out.println(sb);
        }
    }
}
