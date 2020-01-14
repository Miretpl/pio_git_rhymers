package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int EMPTY = -1;
    private static final int DEFAULT = -1;
    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
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

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }
}
