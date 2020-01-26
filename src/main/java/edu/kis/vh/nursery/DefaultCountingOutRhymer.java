package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntDataStack stack = new IntLinkedList();

    public DefaultCountingOutRhymer(IntDataStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() { }

    public int getTotal() {
        return stack.getTotal();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}

/* 2.2
Pytanie 1
    Klasa DefalutContingOutRyhmer nie może zlokalizować metod obiektu stack. Jest to spowodowane brakiej deklaracji ów metod w interfejsie IntDataStack.
    Do poprawnego działania należy zdefiniować odpowiednie metody w interfejsie i zmienić nazwy metod w klasie IntLinkedList lub IntArrayStack.
 */