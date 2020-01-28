package com.ds;

/**
 * 
 * This class has Queue Implementation using linked list. FIFO(First In First
 * Out)
 *
 */
public class QueueUsingLinkedList {
	Node head;

	/**
	 * Enqueue: Insert the element at the end of list
	 * 
	 * @param item
	 */
	public void enQueue(String item) {
		// insert node at the last
		Node node = new Node(item);
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.setNext(node);
		}
	}

	/**
	 * Dequeue: Delete the element from the beginnning
	 * 
	 * @return
	 */
	public String deQueue() {
		if (head == null) {
			return null;
		} else {
			Node temp = head;
			head = head.next;
			return temp.data;
		}
	}

	public static void main(String[] args) {
		QueueUsingLinkedList linkedList = new QueueUsingLinkedList();
		linkedList.enQueue("John");
		linkedList.enQueue("Bravo");
		linkedList.enQueue("Gayle");

		System.out.println(linkedList.deQueue());

	}
}
