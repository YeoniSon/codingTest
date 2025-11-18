package codingTestBook.배열.problem6;


import java.util.*;

public class Main {
    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] challenger = new int[N + 2];
        for(int stage : stages) {
            challenger[stage]++;
        }

        double total = stages.length;
        HashMap<Integer, Double> fails = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.0);
            }else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }

        return fails.entrySet().stream().sorted((o1, o2) ->
                o1.getValue().equals(o2.getValue())? Integer.compare(o1.getKey(),
                        o2.getKey()) : Double.compare(o2.getValue(), o1.getValue())).mapToInt(Map.Entry::getKey).toArray();
    }

    public static void main(String[] args) {
        int[] stage1 = {2,1,2,6,2,4,3,3};
        int[] stage2 = {4,4,4,4,4};
        System.out.println(Arrays.toString(solution(5, stage1)));
        System.out.println(Arrays.toString(solution(4, stage2)));
    }
}
