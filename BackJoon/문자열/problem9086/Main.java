package BackJoon.문자열.problem9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            System.out.printf("%c%c\n", s.charAt(0), s.charAt(s.length()-1));
        }
    }
}
