package edu.skypro.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(task1(nums));
        System.out.println(task2(nums));
        String s = "java, java, java, python, java, c#, java, python";
    }

    static String task1(List<Integer> integers) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : integers) {
            if (integer % 2 != 0) {
                sb.append(integer).append(" ");
            }
        }
        return sb.toString();
    }

    static String task2(List<Integer> integers) {
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>(integers);
        integers.clear();
        integers.addAll(set);
        Collections.sort(integers);
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                sb.append(integer).append(" ");
            }
        }
        return sb.toString();
    }
}
