package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntDataStack stack = new IntLinkedList();

    public DefaultCountingOutRhymer(IntLinkedList stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() { }

    public int getTotal() {
        return stack.getTotal();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}

/* 2.2
Pytanie 1
    Klasa DefalutContingOutRyhmer nie może zlokalizować metod obiektu stack. Jest to spowodowane brakiej deklaracji ów metod w interfejsie IntDataStack.
 */