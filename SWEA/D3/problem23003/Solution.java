package SWEA.D3.problem23003;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        Map<String, Integer> color = new HashMap<>();
        color.put("red", 0);
        color.put("orange",1);
        color.put("yellow",2);
        color.put("green",3);
        color.put("blue",4);
        color.put("purple", 5);

        for (int tc = 1; tc <= T; tc++) {
            String c1 = sc.next();
            String c2 = sc.next();

            int c1Idx = color.get(c1);
            int c2Idx = color.get(c2);

            int dif = Math.abs(c1Idx - c2Idx);

            if (dif  == 0) {
                System.out.println("E");
            }else if (dif == 1 || dif == 5) {
                System.out.println("A");
            }else if (dif == 3) {
                System.out.println("C");
            }else {
                System.out.println("X");
            }
        }
    }
}
