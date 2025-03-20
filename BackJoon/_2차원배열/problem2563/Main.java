package BackJoon._2차원배열.problem2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int total = 0;
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

           for (int j = x; j < x+10; j++){
               for (int k = y; k < y + 10; k++) {
                   if (!paper[j][k]) {
                       paper[j][k] = true;
                       total++;
                   }
               }
           }
        }
        System.out.println(total);
    }
}
