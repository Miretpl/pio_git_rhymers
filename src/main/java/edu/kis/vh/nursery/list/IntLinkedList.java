package edu.kis.vh.nursery.list;


// TODO: class is not used. Consider deleting it.
public class IntLinkedList {

	private static final int IF_EMPTY = -1;
	private Node last;
  
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
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
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return IF_EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}

class Node {

	final int value;
	Node prev, next;

	Node(int i) {
		value = i;
	}

}