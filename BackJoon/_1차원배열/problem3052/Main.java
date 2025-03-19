package BackJoon._1차원배열.problem3052;

//import java.util.HashSet;
//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        HashSet<Integer> hs = new HashSet<Integer>();
//
//        for (int i = 0; i < 10; i++) {
//            hs.add(sc.nextInt()%42);
//        }
//
//        System.out.println(hs.size());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hs.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(hs.size());
    }
}
