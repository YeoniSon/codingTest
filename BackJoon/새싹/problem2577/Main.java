package BackJoon.새싹.problem2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int[] num = new int[10];
        int ABC = A * B * C;
        String number = String.valueOf(ABC);
        for (int i = 0; i < number.length(); i++) {
            int n = number.charAt(i) - '0';
            num[n]++;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
