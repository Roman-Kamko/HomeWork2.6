package edu.skypro.homework;

import java.util.*;

public class Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static String s = "java, java, java, python, java, c, java, python";
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    static void task1() {
        for (int integer : nums) {
            if (integer % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    static void task2() {
        Set<Integer> set = new HashSet<>(nums);
        nums.clear();
        nums.addAll(set);
        Collections.sort(nums);
        for (Integer integer : nums) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }


    static void task3() {
        String replace = s.replaceAll("\\p{Punct}", "");
        List<String> stringList = List.of(replace.split(" "));
        Set<String> stringSet = new HashSet<>(stringList);
        System.out.println(stringSet);
    }

    static void task4() {
        String tmp = s.replaceAll("\\p{Punct}", "");
        List<String> stringList = List.of(tmp.split(" "));
        Set<String> integerSet = new HashSet<>(stringList);
        System.out.println(stringList.size() - integerSet.size());
    }
}
