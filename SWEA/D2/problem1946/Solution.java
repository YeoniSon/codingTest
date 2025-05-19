package SWEA.D2.problem1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T  = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<String> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String alpha = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                for (int j = 0; j < num; j++) {
                    arr.add(alpha);
                }
            }

            sb.append("#" + tc).append("\n");

            for (int i = 0; i < arr.size(); i++) {
                sb.append(arr.get(i));
                if ((i + 1)%10 == 0) {
                    sb.append("\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
