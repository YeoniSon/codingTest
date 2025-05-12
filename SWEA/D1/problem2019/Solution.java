package SWEA.D1.problem2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int num = 1;
        sb.append(num).append(" ");

        for (int i = 0; i < n; i++) {
            num *= 2;
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
