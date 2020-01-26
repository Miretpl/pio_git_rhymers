package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.IntDataStack;

// TODO: class is not used. Consider deleting it.
public class IntLinkedList implements IntDataStack {

	private static final int IF_EMPTY = -1;
	private static final int DEFAULT = 0;
	private int total = DEFAULT;

	private Node last;

	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
			total++;
		}
	}

	public int getTotal() {
		if (callCheck())
			return IF_EMPTY;
		else
			return total;
	}

	public boolean callCheck() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peekaboo() {
		if (callCheck())
			return IF_EMPTY;
		return last.getValue();
	}

	public int countOut() {
		if (callCheck())
			return IF_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}

}

class Node {

	private final int value;
	private Node prev, next;

	Node(int i) {
		value = i;
	}

	void setNext(Node next) {
		this.next = next;
	}

	Node getNext() {
		return next;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getPrev() {
		return prev;
	}

	int getValue() {
		return value;
	}
}