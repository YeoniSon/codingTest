package SWEA.D1.problem1545;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}