package com.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<E> {
	private Node<E> headNode;
	int size;

	// Insertion operations: At beginning, at an index, at end
	public void add(E data) {// at end
		Node<E> endNode = new Node(data, null);
		Node<E> node = headNode;

		if (node == null) {
			headNode = endNode;
		} else {
			while (node.next!=null) {
				node = node.next;
			}
			node.next = endNode;
		}
		size++;
	}

	public void addAtBeginning(E data) {
		Node node = new Node<E>(data, headNode);
		this.headNode = node;
		size++;
	}

	public void addAtIndex(E data, int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("Invalid index:" + index);

		Node indexNode = new Node(data, null);
		int indexCount = 0;
		Node node = headNode;
		if (index == 0) {
			addAtBeginning(data);
			return;
		}
		while (node.next != null) {
			indexCount++;
			if (indexCount == index)
				break;
			node = node.next;
		}
		indexNode.next = node.next;
		node.next = indexNode;
		size++;
	}

	// Get operations: At beginning, at an index, at end
	public E getFirst() {
		if (headNode == null)
			throw new NoSuchElementException();
		return headNode.data;
	}

	public E getLast() {
		if (headNode == null)
			throw new NoSuchElementException();
		Node<E> node = headNode;
		while (node.next != null) {
			node = node.next;
		}
		return node.data;
	}

	public E get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index:" + index);
		if (index == 0)
			return getFirst();

		int indexCount = 0;
		Node<E> node = headNode;
		while (true) {
			indexCount++;
			node = node.next;
			if (indexCount == index)
				break;
		}
		return node.data;
	}

	// Delete operations: At beginning, at an index, at end
	public E deleteAtBeginning() {
		if (headNode == null)
			throw new NoSuchElementException();

		Node<E> deletedNode = headNode;
		headNode = headNode.next;
		size--;
		return deletedNode.data;
	}

	public E deleteAtEnd() {
		if (headNode == null)
			throw new NoSuchElementException();

		Node<E> node = headNode;
		Node prevNode = null;
		while (node.next != null) {
			prevNode = node;
			node = node.next;
		}
		if (prevNode == null)
			headNode = null;
		else
			prevNode.next = null;
		size--;
		return node.data;
	}

	public E deleteAtIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index:" + index);
		if (index == 0)
			return deleteAtBeginning();

		int i = 0;
		Node<E> node = headNode;
		Node<E> prevNode = null;
		E data = null;
		while (true) {
			prevNode = node;
			node = node.next;
			i++;
			if (i == index) {
				break;
			}
		}
		prevNode.next = node.next;
		data = node.data;
		size--;

		return data;
	}

	// replace operations: At beginning, at an index, at end
	public E replaceAtFirst(E data) {
		if (headNode == null)
			throw new NoSuchElementException();

		E replacedData = headNode.data;
		headNode.data = data;
		return replacedData;
	}

	public E replaceAtEnd(E data) {
		if (headNode == null)
			throw new NoSuchElementException();

		Node<E> node = headNode;
		while (node.next != null) {
			node = node.next;
		}
		E replacedData = node.data;
		node.data = data;
		return replacedData;
	}

	public E replaceAtIndex(E data, int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index:" + index);

		Node<E> node = headNode;
		// Node<E> prevNode = null;
		int i = 0;

		while (true) {
			if (index == i)
				break;
			node = node.next;
			i++;
		}
		E deletedData = node.data;
		node.data = data;
		return deletedData;
	}

	public int length() {
		return size;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append('[');
		Node node = headNode;
		while (node != null) {
			sb.append(node.data);
			sb.append(',');
			node = node.next;
		}
		sb.append(']');
		return sb.toString();
	}

	static class Node<E> {
		E data;
		Node next;

		Node() {
		}

		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

}
