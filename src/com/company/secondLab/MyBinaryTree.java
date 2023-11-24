package com.company.secondLab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyBinaryTree {
    private MyNode rootNode;

    public MyBinaryTree(){
        this.rootNode = null;
    }

    public void add(int value) {
        rootNode = addRecursive(rootNode, value);
    }

    private MyNode addRecursive(MyNode current, int value) {
        if (current == null) {
            return new MyNode(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void getLevelLinkedList(){
        List <List<MyNode>> list = createLevelLinkedList(this.rootNode);
        System.out.println(list.toString());
        for (List<MyNode> i : list) {
            for (MyNode mn : i)
                System.out.print("value: " + mn.getValue()+ " ");
            System.out.println();
        }
    }

    private List <List<MyNode>> createLevelLinkedList(MyNode root) {
        List<List<MyNode>> myList = new ArrayList<>();
        Queue<MyNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while(!queue.isEmpty()){
            myList.add(new ArrayList<>());

            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                MyNode node = queue.poll();
                myList.get(depth).add(node);
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
            depth++;
        }
        return myList;
    }

    public void print(){
        TreePrinter.print(rootNode);
    }
    static class MyNode implements TreePrinter.PrintableNode {
        private int value;
        private MyNode right;
        private MyNode left;

        MyNode(int value){
            this.value = value;
        }

        MyNode(int value, MyNode rightNode, MyNode leftNode){
            this.value = value;
            this.right = rightNode;
            this.left = leftNode;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public MyNode getRight() {
            return right;
        }

        @Override
        public String getText() {
            return ""+value;
        }

        public void setRight(MyNode right) {
            this.right = right;
        }

        public MyNode getLeft() {
            return left;
        }

        public void setLeft(MyNode left) {
            this.left = left;
        }
    }
}
