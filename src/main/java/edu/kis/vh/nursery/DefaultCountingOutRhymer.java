package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 12;
    private int[] numbers = new int[INT1];

    public int total = INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean check() {
        return total == INT;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peek() {
        if (check())
            return INT;
        return numbers[total];
    }

    public int countOut() {
        if (check())
            return INT;
        return numbers[total--];
    }

}
