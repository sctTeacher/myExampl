package com.shan.danli;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head =new Node("a");
		Node head1 =new Node("b");
		Node head2 =new Node("c");
		head.setNext(head1);
		head1.setNext(head2);
		
		Node h = head;
		while(h!=null){
			System.out.print(h.getData());
			h=h.getNext();
		}
		head = reve2(head);
		System.out.println("\n-----------");
		while(head!=null){
			System.out.println(head.getData());
			head=head.getNext();
		}
	}
	
	static Node reve1(Node head){
		if(null==head||head.getNext()==null){
			return head;
		}
		Node reHead = reve1(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return reHead;
	}

	static Node reve2(Node head){
		if(null==head){
			return head;
		}
		Node pre=head;
		Node cur=head.getNext();
		Node temp;
		while(cur!=null){
			temp=cur.getNext();
			cur.setNext(pre);
			pre=cur;
			cur=temp;
		}
		head.setNext(null);
		
		return pre;
	}
}


class Node {
	private String data;
	private Node next;
	
	public Node(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}