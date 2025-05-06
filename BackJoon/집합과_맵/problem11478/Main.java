package BackJoon.집합과_맵.problem11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <s.length(); i++) {
            for (int j = 0; j <= s.length()-i; j++) {
                set.add(s.substring(j,j+i));
            }
        }

        System.out.println(set.size());
    }
}
