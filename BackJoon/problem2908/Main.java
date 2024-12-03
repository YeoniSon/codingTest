package BackJoon.problem2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuffer a = new StringBuffer(st.nextToken());
        StringBuffer b = new StringBuffer(st.nextToken());

        int num1 = Integer.parseInt(a.reverse().toString());
        int num2 = Integer.parseInt(b.reverse().toString());

        System.out.println(Math.max(num1, num2));

    }
}
