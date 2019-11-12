package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private int[] NUMBERS = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}
	// Błędy formatowania i konwencji - 1
	public boolean callCheck() {
			return total == -1;
	} // zle

	public boolean isFull() {
				return total == 11;
			}  // zle
		
	protected int peekaboo() { // zle
		if (callCheck()) // zle
			return -1; // zle
		return NUMBERS[total]; // zle
	} // zle
			
	public int countOut() { // zle
		if (callCheck()) // zle
			return -1; // zle
		return NUMBERS[total--]; // zle
	} // zle
}
