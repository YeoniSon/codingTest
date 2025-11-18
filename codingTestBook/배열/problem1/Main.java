package codingTestBook.배열.problem1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -5, 2, 4, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
