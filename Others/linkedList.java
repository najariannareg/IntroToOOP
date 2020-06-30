package llist;

public class linkedList{
	Node root;

	public void add(int value){
		if(root == null){
			root == new Node();
			root.value = value;
			return;
		}

		Node current = root;
		while(current.next != null){
			current = current.next;
		}

		//current.next = new Node();
		//current.next.value = value;
		Node newNode = new Node();
		newNode.value = value;
		current.next = newNode;
	}

	class Node{
		int value;
		Node next;
	}
}