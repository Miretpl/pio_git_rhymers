package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntDataStack stack = new IntLinkedList();

    DefaultCountingOutRhymer(IntDataStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() { }

    int getTotal() {
        return stack.getTotal();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    boolean callCheck() {
        return stack.callCheck();
    }

    boolean isFull() {
        return stack.isFull();
    }

    int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}