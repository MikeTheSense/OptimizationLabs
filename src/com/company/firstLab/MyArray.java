package com.company.firstLab;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MyArray {
    public static boolean isUniqueSymbols(String str) {
        if (str.length() > 256) return false;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!(set.add(str.charAt(i)))) return false;
        }
        return true;
    }

    public static boolean isUniqueSymbolsAdvanced(String str) {
        if (str.length() > 256) return false;
        char[] myArray = str.toCharArray();
        boolean[] bool = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            if (!(bool[str.charAt(i)]))
                bool[str.charAt(i)] = true;
            else return false;
        }
        return true;
    }

    public static boolean isUniqueWithoutStructure(String str) {
        if (str.length() > 256) return false;
        int i = 0;
        while(i < str.length()) {
            int j = i+1;
            char copy = str.charAt(i);
            while(j < str.length()) {
                if (str.charAt(j) == copy) return false;
                else j++;
            }
            i++;
        }
        return true;
    }

    //Add 3rd method without based structure


    public static <E> LinkedList<E> test(LinkedList<E> list) {
        Set<E> set = new HashSet<>(list);
        return new LinkedList<E>(set);
    }
}
