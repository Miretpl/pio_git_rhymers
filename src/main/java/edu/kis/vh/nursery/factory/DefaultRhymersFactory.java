package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultCountingOutRhymer GetStandardRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFalseRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public defaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
/*
    Intellij
    alt + <- = powoduje przejście do zakładki otwartej po lewej stronie
    alt + -> = powoduje przejście do zakładki otwartej po prawej stronie
*/