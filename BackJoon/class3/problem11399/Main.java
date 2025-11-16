package BackJoon.class3.problem11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int[] harr = new int[N];

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                harr[i] = arr[0];
            }else {
                harr[i] = harr[i - 1] + arr[i];
            }
        }

        int sum = Arrays.stream(harr).sum();
        System.out.println(sum);
    }
}
