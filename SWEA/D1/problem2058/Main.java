package SWEA.D1.problem2058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i,i+1);
            sum += Integer.parseInt(c);
        }
        System.out.println(sum);
    }
}
