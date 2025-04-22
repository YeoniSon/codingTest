package BackJoon.일반수학1.problem2903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        double line = 2;
        int point = 0;

        for (int i = 0; i < n; i++) {
            line = line + Math.pow(2, i);
            point = (int) (line * line);
        }

        System.out.println(point);

    }
}
