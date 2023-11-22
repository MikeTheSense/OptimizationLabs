package com.company;

import java.util.*;


//1 -- without any structure
//2nd -- ok
//3rd -- stack should be dynamic, e.g. dynamically size of 2nd increased from 30 to 60( ++capacity)


public class Main {

    public static void main(String[] args) throws Exception {
        String str = "Abcfdsfasdasfasdfasdf";
        String str1 = "Abcdefrtgnm,./';lkjfjlsak;dhsafdh ulnsafdlibafssafdjkjkashjsafjkkjasf";
        String str2 = "qazxswedcrfvtgbyhnujmik,ol.p;/[']";

        System.out.println(isUniqueSymbols(str2));
        System.out.println(isUniqueSymbolsAdvanced(str2));
        System.out.println(isUniqueWithoutStructure(str2));

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.printList();
        list.removeDuplicates();
        list.printList();

//        MyStack ms = new MyStack(100);
//        ms.push(0, 1);
//        ms.push(0, 2);
//        ms.push(1, 1);
//        ms.push(2, 1);
//        System.out.println(ms.pop(0));
//        System.out.println(ms.pop(0));

        MyAdvancedStack mas = new MyAdvancedStack(5);
        mas.push(0,2);
        mas.push(0,2);
        mas.push(0,2);
        mas.push(0,2);
        //mas.push(0,2);
        mas.push(1,19);
        mas.push(1,3);
        mas.push(1,3);
        mas.push(1,3);
        mas.push(1,13);
        mas.push(1,3);

        mas.push(2,6);
        mas.push(2,6);
        mas.push(2,6);
        mas.push(2,6);
        mas.push(2,26);
        mas.push(2,6);
        mas.push(0,20);
        //mas.push(1,3);

        //mas.push(0,2);
        //mas.push(1,3);
        //mas.push(0,5);


        mas.printStack();
        System.out.println(mas.pop(0));
        System.out.println(mas.pop(1));
        System.out.println(mas.pop(2));
        mas.printStack();
    }

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