package BackJoon.일반수학1.problem2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String b = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int tmp = 1;
        int sum = 0;

        for (int i = b.length()-1; i >= 0; i--) {
            char c = b.charAt(i);

            if ('A' <= c && c <= 'Z') {
                sum +=(c - 'A' + 10) * tmp;
            } else {
                sum += (c - '0') * tmp;
            }
            tmp *= n;
        }
        System.out.println(sum);
    }
}
