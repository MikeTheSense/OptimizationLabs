package com.company;

import com.company.FifthLab.MyFifth;
import com.company.firstLab.MyAdvancedStack;
import com.company.firstLab.MyArray;
import com.company.firstLab.MyLinkedList;
import com.company.fourthLab.MyFourth;
import com.company.secondLab.MyBinaryTree;
import com.company.secondLab.TreePrinter;
import com.company.thirdLab.MyBitOperation;
import com.sun.source.tree.Tree;

import java.util.*;


//1 -- without any structure
//2nd -- ok
//3rd -- stack should be dynamic, e.g. dynamically size of 2nd increased from 30 to 60( ++capacity)


public class Main {

    public static void main(String[] args) throws Exception {
        //firstLab();
        //secondLab();
        //thirdLab();
        //fourthLab();
        fifthLab();
    }

    public static void secondLab() throws Exception{
        MyBinaryTree bin = new MyBinaryTree();
        bin.add(20);
        bin.add(2);
        bin.add(4);
        bin.add(6);
        bin.add(8);
        bin.add(10);
        bin.add(1);
        bin.add(3);
        bin.add(5);
        bin.add(7);
        bin.add(11);

        bin.print();
        bin.getLevelLinkedList();
    }
    public static void thirdLab() throws Exception{
        MyBitOperation.swapInt(345);
    }

    public static void fourthLab(){
        int n = 5;
        String myTrace = "My trace: ";
        System.out.println(MyFourth.myReccursion(n, new long[n]));
    }

    public static void fifthLab(){
        System.out.println(MyFifth.getWrongNumber(5));
    }

    public static void firstLab() throws Exception {
        String str = "Abcfdsfasdasfasdfasdf";
        String str1 = "Abcdefrtgnm,./';lkjfjlsak;dhsafdh ulnsafdlibafssafdjkjkashjsafjkkjasf";
        String str2 = "qazxswedcrfvtgbyhnujmik,ol.p;/[']";

        System.out.println(MyArray.isUniqueSymbols(str2));
        System.out.println(MyArray.isUniqueSymbolsAdvanced(str2));
        System.out.println(MyArray.isUniqueWithoutStructure(str2));

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


}