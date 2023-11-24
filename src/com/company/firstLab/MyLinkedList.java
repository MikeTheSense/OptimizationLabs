package com.company.firstLab;

public class MyLinkedList<E> {
    Node head;

    public void add(E value) {
        head = new Node(value, head);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeDuplicates() {
        if (head == null) return;
        Node current = head;
        while (current != null) {
            Node itter = current;
            while (itter.next != null) {
                if (itter.next.value.equals(current.value)) {
                    itter.next = itter.next.next;
                } else itter = itter.next;
            }
            current = current.next;
        }
    }

    static class Node<E> {
        E value;
        Node next;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}
