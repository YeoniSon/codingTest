package BackJoon.새싹.problem31403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        System.out.println(number(A,B,C));
        System.out.println(charNumber(A,B,C));
    }

    public static int number(int A, int B , int C) {
        return A + B - C;
    }

    public static int charNumber(int A, int B , int C) {
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(B);

        int num = Integer.parseInt(sb.toString()) - C;
        return num;
    }
}
