package com.doublylinkedlist;

public class DoublyLinkedList<E> {
	Node<E> head;
	Node<E> tail;//Need tail to facilitate to traverse backwards
	int size;
	
	// Insertion operations: At beginning, at an index, at end
	public void add(E data) {
		Node<E> newNode = new Node(data,null,null);
		if(head==null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next=newNode;
		newNode.previous = tail;
		tail=newNode;
		size++;
	}
	
	public void addAtBeginning(E data) {
		Node<E> node = new Node<>(data, null, head);
		if(head!=null) {
			head.previous = node;
		}else {
			tail = node;
		}
		head=node;
		size++;
	}
	
	public void addAtIndex(E data, int index) {
		if(index<0 || index>size)
			throw new IndexOutOfBoundsException("Invalid index:" + index);
		
		if(index==0)
			addAtBeginning(data);
		else if(index==size)
			add(data);
		
		Node<E> newNode = new Node<>(data, null, null);
		Node<E> node = head;
		int i=0;
		
		while(true) {
			if(i==index)
				break;
			node = node.next;
			i++;
		}
		Node<E> prevNode = node.previous;
		prevNode.next = newNode;
		newNode.previous = prevNode;
		newNode.next=node;
		node.previous=newNode;
		size++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append('[');
		Node node = head;
		while(node!=null) {
			sb.append(node.data);
			sb.append(',');
			node=node.next;
		}
		sb.append(']');
		return sb.toString();
	}
	
	
	public String traverseReverseString() {
		StringBuilder sb = new StringBuilder("");
		sb.append('[');
		Node node = tail;
		while(node!=null) {
			sb.append(node.data);
			sb.append(',');
			node = node.previous;
		}
		sb.append(']');
		return sb.toString();
	}
	
	
	
	
	
	public int length() {
		return size;
	}
	
	static class Node<E>{
		E data;
		Node<E> previous;
		Node<E> next;
		
		Node(){}

		public Node(E data, Node<E> previous, Node<E> next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
	}

}
