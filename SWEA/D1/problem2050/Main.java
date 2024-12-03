package SWEA.D1.problem2050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i)-'A' + 1;
            System.out.print(n + " ");
        }
    }
}
