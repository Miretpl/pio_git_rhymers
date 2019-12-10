package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY = -1;
    private static final int DEFAULT = -1;
    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    private int total = -1;
 
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean check() {
        return total == EMPTY;
    }

    private boolean isFull() {
        return total == CAPACITY-1;
    }

    int peek() {
        if (check())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (check())
            return DEFAULT;
        return numbers[total--];
    }

}
