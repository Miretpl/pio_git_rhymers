package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IntDataStack;

class IntArrayStack implements IntDataStack {

    private static final int EMPTY = -1;
    private static final int DEFAULT = -1;
    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY;

    int getTotal() {
        return total;
    }

    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == EMPTY;
    }

    boolean isFull() {
        return total == CAPACITY-1;
    }

    int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }
}
