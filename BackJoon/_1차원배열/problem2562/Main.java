package BackJoon._1차원배열.problem2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max, idx;
        max = 0;
        idx = 1;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());

            if (max < num) {
                max = num;
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
