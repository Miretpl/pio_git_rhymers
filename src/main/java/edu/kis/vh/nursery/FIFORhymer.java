package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    /*
        Pytanie 4
            ponieważ IntLinkedList jest lista dynamiczona
     */
    private final IntDataStack temp = new IntLinkedList();

    public FIFORhymer(IntDataStack stack) { super(stack); }
    public FIFORhymer() { }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
