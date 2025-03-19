package BackJoon._1차원배열.problem10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int j = Integer.parseInt(st.nextToken())-1;
            int k = Integer.parseInt(st.nextToken())-1;

            while (j < k) {
                int tmp = arr[j];
                arr[j++] = arr[k];
                arr[k--] = tmp;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
