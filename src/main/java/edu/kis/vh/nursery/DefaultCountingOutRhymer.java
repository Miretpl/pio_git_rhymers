package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int getTotal() {
        return total;
    }

    private int total = -1;
 
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean check() {
        return total == -1;
    }

    private boolean isFull() {
        return total == 11;
    }

    int peek() {
        if (check())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (check())
            return -1;
        return numbers[total--];
    }

}
