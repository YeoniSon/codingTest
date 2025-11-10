package BackJoon.새싹.problem10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            //층수
            int Y;
            if (N % H == 0) {
                Y = H * 100;
            }else {
                Y = N % H * 100;
            }

            // 호수
            int X;
            if (N % W == 0) {
                X = N / H;
            } else {
                X = (N / H) + 1;
            }

            System.out.println(Y + X);
        }
    }
}
