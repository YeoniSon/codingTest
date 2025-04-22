package BackJoon.일반수학1.problem2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int quarter = N / 25;
            int remainder = N % 25;
            int dime = remainder / 10;
            remainder = remainder % 10;
            int nickel = remainder / 5;
            remainder = remainder % 5;
            int penny = remainder/1;


            System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);

        }
    }
}
