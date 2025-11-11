package BackJoon.새싹.problem8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int sum = 0;
            int Osum = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    Osum++;
                    sum += Osum;
                }else {
                    Osum = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
