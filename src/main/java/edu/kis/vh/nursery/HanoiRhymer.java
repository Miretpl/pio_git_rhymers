package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0; // zle

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) // zle
			totalRejected++;
		else // zle
			super.countIn(in); // zle
	}

	// Błędy formatowania i konwencji - 3
	// alt + <- przechodzi do zakładki otwartej po lewo
	// alt + -> przechodzi do zakładki otwartej po prawo
}
