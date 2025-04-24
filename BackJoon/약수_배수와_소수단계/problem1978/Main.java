package BackJoon.약수_배수와_소수단계.problem1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int a;

        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(st.nextToken());
            for (int j = 2; j <= a; j++) {
                if (j == a) {
                    cnt++;
                }
                if (a % j == 0) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
