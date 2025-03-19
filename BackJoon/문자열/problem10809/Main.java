package BackJoon.문자열.problem10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), "");

        String s = st.nextToken();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for (int val :
                arr) {
            System.out.print(val + " ");
        }
    }
}
