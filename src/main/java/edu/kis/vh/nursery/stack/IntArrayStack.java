package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.IntDataStack;

class IntArrayStack implements IntDataStack {

    private static final int IF_EMPTY = -1;
    private static final int DEFAULT = 0;
    private int total = IF_EMPTY;

    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];

    int getTotal() {
        return total;
    }

    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    private boolean callCheck() {
        return total == IF_EMPTY;
    }

    private boolean isFull() {
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
/* zad 2.2
Pytanie 2
    Nie

Pytanie 3
    IntDataStack
 */