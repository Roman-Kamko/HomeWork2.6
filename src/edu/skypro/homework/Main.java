package edu.skypro.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(task1(nums));
        System.out.println(task2(nums));

        String s = "java, java, java, python, java, c#, java, python";
        System.out.println(task3(s));
        System.out.println(task4(s));

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

    // задание 3 и 4, не совсем понятно что хотят, сделал так как я это понял)))

    static Set<String> task3(String s) {
        String replace = s.replaceAll("\\p{Punct}", "");
        List<String> stringList = List.of(replace.split(" "));
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < stringList.size(); i++) {
            String tmp = stringList.get(i);
            if (Collections.frequency(stringList, tmp) > 1) {
//                stringSet.add(tmp + " " + Collections.frequency(stringList, tmp));
                stringSet.add(tmp);
                // как я понял от меня хотят только вывод дублирующихся слов без их количества
            }
        }
        return stringSet;
    }

    static Set<Integer> task4(String s) {
        String replace = s.replaceAll("\\p{Punct}", "");
        List<String> stringList = List.of(replace.split(" "));
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < stringList.size(); i++) {
            String tmp = stringList.get(i);
            if (Collections.frequency(stringList, tmp) > 1) {
                integerSet.add(Collections.frequency(stringList, tmp));
                // как я понял от меня хотят только вывод сколько раз слово повторилось(если оно повторилось)
                // и непонятно нужно просуммировать или вывести для каждого повтора свое число
            }
        }
        return integerSet;
    }
}
