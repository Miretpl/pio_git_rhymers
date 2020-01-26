package edu.kis.vh.nursery;

/**
 *	Class HanoiRhymer. Extends DefaultCountingOutRhymer class.
 *
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     *	Quantity of rejected numbers.
     */
    private int totalRejected = 0;

    /**
     *	Constructor HanoiRhymer with stack.
     */
    public HanoiRhymer(IntDataStack stack) { super(stack); }

    /**
     *	Deafult constructor HanoiRhymer.
     */
    public HanoiRhymer() { }

    /**
     *	Return value of totalRejected field.
     * @return Quantity of rejected numbers.
     */
    int reportRejected() {
        return totalRejected;
    }

    /**
     * Adds given number to array. Increase totalRejected if array is not empty and last added number is greater or equal than given one. Method is Overrided.
     * @param in Number to add.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
