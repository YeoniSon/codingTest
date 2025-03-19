package BackJoon._1차원배열.problem5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//
//        int[] student = new int[30];
//
//        for (int i = 0; i < 28; i++) {
//            int n = scan.nextInt();
//            student[n-1] = 1;
//        }
//
//        for (int i = 0; i < student.length; i++) {
//            if(student[i] != 1){
//                System.out.println(i+1);
//            }
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] student = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            student[n-1] = true;
        }

        for (int i = 0; i < student.length; i++) {
            if (!student[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
