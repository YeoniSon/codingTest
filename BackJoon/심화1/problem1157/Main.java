package BackJoon.심화1.problem1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();

        int[] word = new int[26];

        String cap = w.toUpperCase();

        for (int i = 0; i < w.length(); i++) {
            word[cap.charAt(i)-65]++;
        }
        int max = 0;
        char ans = '?';

        for (int i = 0; i < word.length; i++) {
            if (max < word[i]) {
                max = word[i];
                ans = (char)(i+65);
            } else if (max == word[i]) {
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}
