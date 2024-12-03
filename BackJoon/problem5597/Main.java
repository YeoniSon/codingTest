package BackJoon.problem5597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] student = new int[30];

        for (int i = 0; i < 28; i++) {
            int n = scan.nextInt();
            student[n-1] = 1;
        }

        for (int i = 0; i < student.length; i++) {
            if(student[i] != 1){
                System.out.println(i+1);
            }
        }
    }
}
