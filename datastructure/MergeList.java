package datastructure;

import java.util.*; 

class NodeN 
{ 
	int data; 
	NodeN next; 
	NodeN(int d) {data = d; 
				next = null;} 
} 
	
class MergeLists 
{ 
	NodeN head; 

public void addToTheLast(NodeN node) 
{ 
	if (head == null) 
	{ 
		head = node; 
	} 
	else
	{ 
		NodeN temp = head; 
		while (temp.next != null) 
			temp = temp.next; 
		temp.next = node; 
	} 
} 
void printList() 
{ 
	NodeN temp = head; 
	while (temp != null) 
	{ 
		System.out.print(temp.data + " "); 
		temp = temp.next; 
	} 
	System.out.println(); 
} 

public static void main(String args[]) 
{ 
	MergeLists llist1 = new MergeLists(); 
	MergeLists llist2 = new MergeLists(); 
	
	llist1.addToTheLast(new NodeN(5)); 
	llist1.addToTheLast(new NodeN(10)); 
	llist1.addToTheLast(new NodeN(15)); 
	
	llist2.addToTheLast(new NodeN(2)); 
	llist2.addToTheLast(new NodeN(3)); 
	llist2.addToTheLast(new NodeN(20)); 
	
	
	llist1.head = new Gfg().sortedMerge(llist1.head, 
										llist2.head); 
	llist1.printList();	 	
} 
} 

class Gfg 
{ 
	NodeN sortedMerge(NodeN headA, NodeN headB) 
{ 
	NodeN dummyNode = new NodeN(0); 
	
	NodeN tail = dummyNode; 
	while(true) 
	{ 
		if(headA == null) 
		{ 
			tail.next = headB; 
			break; 
		} 
		if(headB == null) 
		{ 
			tail.next = headA; 
			break; 
		} 
		if(headA.data <= headB.data) 
		{ 
			tail.next = headA; 
			headA = headA.next; 
		} 
		else
		{ 
			tail.next = headB; 
			headB = headB.next; 
		} 
		tail = tail.next; 
	} 
	return dummyNode.next; 
} 
} 

