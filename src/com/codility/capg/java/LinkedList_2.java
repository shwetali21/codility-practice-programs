package com.codility.capg.java;

/**Write a function: 
 * class Solution { public int solution(IntList L); }
 * that, given a non-empty linked list L consisting of N nodes, returns its length.
 * 
 * class IntList {
 * 	public int value;
 * 	public IntList next;
 * }
 *
 * For example, given list L shown in the example above, the function should return 4.
 * 
 * Assume that:
 * 1. N is an integer within the range [1..5,000]
 * 2. list L does not have a cycle (each non-empty pointer points to a different structure).
 */
class Node {

	int data;
	Node next;

	Node() {
		data = 0;
		next = null;
	}

	Node(int data) {
		this.data = data;
		next = null;
	}
}

class MyLinkedList {

	Node head;

	public void add(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public int getCount() {
		int count =  0;

		System.out.print("Elements in List: ");
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			count++;
			temp = temp.next;
		}
		System.out.println();
		return count;
	}

}

public class LinkedList_2 {

	public static void main(String[] args) { 
		MyLinkedList list = new MyLinkedList(); 
		list.add(1); 
		list.add(3); 
		list.add(1); 
		list.add(2); 
		list.add(1); 
		
		System.out.println("Size of List: " + list.getCount()); 
	} 
}
