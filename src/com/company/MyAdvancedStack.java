package com.company;

import java.util.Arrays;

public class MyAdvancedStack {
    private int[] buffer;
    private int initialCapacity;
    private int[] stackPointer = {0, 0, 0};
    private int[] stackCapacity = {0, 0, 0};


    MyAdvancedStack(int capacity) {
        this.initialCapacity = capacity;
        this.buffer = new int[initialCapacity * 3];
        stackCapacity[0] = capacity;
        stackCapacity[1] = capacity;
        stackCapacity[2] = capacity;
        stackPointer[0] = 0;
        stackPointer[1] = initialCapacity;
        stackPointer[2] = initialCapacity * 2;

    }
    //увеличиваем стек вдвое, т.е если по 15, то общая длина 45. И если надо увеличить пространство, то увеличиваем в два раза.


    void push(int stackNum, int value) {
        if (check(stackNum)) increaseStackCapacity(stackNum);
        buffer[stackPointer[stackNum]] = value;
        stackPointer[stackNum]++;
    }

    void increaseStackCapacity(int stackNum) {
        int[] newBuffer = new int[this.buffer.length + stackCapacity[stackNum]];
        newBuffer = Arrays.copyOf(buffer, newBuffer.length);
        if (stackNum < 2) {
            System.arraycopy(
                    buffer,
                    stackPointer[stackNum] + 1,
                    newBuffer,
                    stackPointer[stackNum] + stackCapacity[stackNum] + 1,
                    buffer.length - stackPointer[stackNum] - 1);
            stackPointer[2] += stackCapacity[stackNum];
            if (stackNum == 0) stackPointer[1] += stackCapacity[stackNum];
        }
        stackCapacity[stackNum] *= 2;
        buffer = newBuffer;
        adjust(stackNum);
        System.out.println("stack #" + stackNum + " increased");
    }

    void adjust(int stackNum) {
        int sum = 0;
        for (int i = 0; i <= stackNum; i++) sum += stackCapacity[i];
        for (int i = stackPointer[stackNum]; i < sum; i++) {
            buffer[i] = 0;
        }
    }


    int pop(int stackNum) throws Exception {
        if (stackPointer[stackNum] == 0) throw new Exception("Stack is empty");
        // int index = stackNum * stackSize + stackPointer[stackNum];
        stackPointer[stackNum]--;
        int value = buffer[stackPointer[stackNum]];
        buffer[stackPointer[stackNum]] = 0;
        return value;
    }


    int peek(int stackNum) throws Exception {
        if (stackPointer[stackNum] == 0) throw new Exception("Stack is empty");
        stackPointer[stackNum]--;
        return buffer[stackPointer[stackNum]];
    }

    boolean isEmpty(int stackNum) {
        return stackPointer[stackNum] == 0;
    }

    void printStack() {
        for (int e : buffer) System.out.print(e + " ");
        System.out.println();
        System.out.println("Size " + buffer.length);
    }

    private boolean check(int stackNum) {
        int sum = 0;
        for (int i = 0; i <= stackNum; i++) sum += stackCapacity[i];
        return stackPointer[stackNum] >= sum - 1;
    }
}
