package edu.kis.vh.nursery.list;


// TODO: class is not used. Consider deleting it.
public class IntLinkedList {

	private static final int IF_EMPTY = -1;
	private Node last;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return IF_EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return IF_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
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