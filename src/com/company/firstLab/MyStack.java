package com.company.firstLab;

public class MyStack {
    //dynamic length
    private int stackSize;
    private int[] buffer;
    private int[] stackPointer = {0, 0, 0};

    MyStack(int size) {
        this.stackSize = size;
        this.buffer = new int[stackSize * 3];
    }

    void push(int stackNum, int value) {
        if (stackPointer[stackNum] >= stackSize) return;
        int index = stackNum * stackSize + stackPointer[stackNum] + 1;
        stackPointer[stackNum]++;
        buffer[index] = value;
    }

    int pop(int stackNum) throws Exception {
        if (stackPointer[stackNum] == 0) throw new Exception("Stack is empty");
        int index = stackNum * stackSize + stackPointer[stackNum];
        stackPointer[stackNum]--;
        int value = buffer[index];
        buffer[index] = 0;
        return value;
    }

    int peek(int stackNum) throws Exception {
        if (stackPointer[stackNum] == 0) throw new Exception("Stack is empty");
        int index = stackNum * stackSize + stackPointer[stackNum];
        return buffer[index];
    }

    boolean isEmpty(int stackNum) {
        return stackPointer[stackNum] == 0;
    }
}
