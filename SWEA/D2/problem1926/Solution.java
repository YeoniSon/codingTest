package SWEA.D2.problem1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n ; i++) {
            String num = Integer.toString(i);
            if (num.contains("3")||num.contains("6")||num.contains("9")) {
                for (int j = 0; j < num.length(); j++) {
                    if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
                        sb.append("-");
                    }
                }
                sb.append(" ");
            }else {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
