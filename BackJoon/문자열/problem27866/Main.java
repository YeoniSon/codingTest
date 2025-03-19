package BackJoon.문자열.problem27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine())-1;

        System.out.println(s.substring(n,n+1));
        System.out.println(s.charAt(n));
    }
}
