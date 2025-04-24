package BackJoon.약수_배수와_소수단계.problem9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) {
                break;
            }

            int[] arr = new int[n];

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i != n) {
                    arr[i] = i;
                    sum += i;
                }
            }

            if (sum != n) {
                sb.append(n + " is NOT perfect. \n");
                continue;
            }

            sb.append(n + " = 1");

            for (int i = 1; i <= n; i++) {
                if (arr[i-1] != 0 && arr[i-1] != 1) {
                    sb.append(" + " + arr[i-1]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
