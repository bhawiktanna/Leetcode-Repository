import java.util.*;


public class MergeTwoSortedLinkedLists
{
    
    public static class Node{
        int data;
        Node next;
}

    public static class LinkedList{
        Node head;
        Node tail;
        int size;
    
    public LinkedList mergeTwoSortedLinkedLists(LinkedList l1, LinkedList l2){
        Node one = l1.head, two = l2.head;
        LinkedList res = new LinkedList();
        
        while(one != null && two != null){
            if(one.data < two.data){
                res.addLast(one.data);
                one = one.next;
            }
            else{
                res.addLast(two.data);
                two = two.next;
            }
        }
        while(one != null){
            res.addLast(one.data);
            one = one.next;
        }
        while(two != null){
            res.addLast(two.data);
            two = two.next;
        }
        return res;
    }    
        
    public int midOfLinkedList(){
        Node slow = head, fast = head;
                //fast != tail || fast.next != tail
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }    
        
    public int kthElementFromLast(int k){
        Node slow = head, fast = head;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        
        while(fast != tail){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }    
    
    public void removeAt(int idx){
        //This function is wrong at the mmoment
        if(idx<0 || idx>=size){
            System.out.println("Invalid arguments");
        }
        else if(idx == 0){
            removeFirst();
        }
        else if(idx == size-1){
            removeLast();
        }
        else{
            Node temp = head;
            for(int i=0;i<size-2;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }    
        
    public void reversePI(){
        Node prev = null, curr = head;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        Node temp = head;
        head = tail;
        tail = head;
    }    
        
    private Node getNodeAt(int idx){
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp;
    }
    
    public void reverseDI(){
        int li = 0;
        int ri = size-1;
        while(li < ri){
            Node leftNode = getNodeAt(li);
            Node rightNode = getNodeAt(ri);
            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;
            li++; ri--;
        }
    }
    public void removeLast(){
        if(size == 0){
            System.out.println("List is empty");
        }
        else if(size == 1){
            head = tail = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i=0;i<size-2;i++){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }
    } 
    

    
    public void addAtIndex(int idx, int value){
        if(idx<0 || idx > size){
            System.out.println("Invalid arguments");
        }
        else if(idx == 0){
            addFirst(value);
        }
        else if(idx == size){
            addLast(value);
        }
        else{
            Node temp = new Node();
            temp.data = value;
            Node newPtr = head;
            Node prevPtr = head;
            for(int i=0;i<idx;i++){
                prevPtr = newPtr;
                newPtr = newPtr.next;
            }
            temp.next = newPtr;
            prevPtr.next = temp;
            size++;
        }
    }    
        
    public void addFirst(int value){
        Node temp = new Node();
        temp.data = value;
        if(size == 0){
            head = tail = temp;
        }
        else{
            Node t = head;
            head = temp;
            temp.next = t;
        }
        size++;
    }    
        
    public int getAt(int idx){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        }
        else if(idx<0 || idx >= size){
            System.out.println("Invalid arguments");
            return -1;
        }
        else{
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }    
        
    void removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }
        else{
            head = head.next;
            size--;
        }
    }    
    
    void sizeofLinkedList(){
        System.out.println("size of LinkedList: "+this.size);
    }
    
    void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void addLast(int val){
        Node temp = new Node();
        temp.data = val;
        temp.next = null;
        
        if(size == 0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> lst1 = new ArrayList<>();
		int idx = 0;
		while (idx < n) {
		    int i = sc.nextInt();
		    lst1.add(i);
		    idx++;
		}
        idx = 0;
		LinkedList l1 = new LinkedList();
		for(int i = 0;i<n;i++){
		    l1.addLast(lst1.get(i));
		}
		
// 		System.out.println(l.getAt(0));
// 		System.out.println(l.getAt(1));
	    l1.display();
	    
	    List<Integer> lst2 = new ArrayList<>();
	    n = sc.nextInt();
		while (idx < n) {
		    int i = sc.nextInt();
		    lst2.add(i);
		    idx++;
		}

		LinkedList l2 = new LinkedList();
		for(int i = 0;i<lst2.size();i++){
		    l2.addLast(lst2.get(i));
		}
		l2.display();
		LinkedList res = new LinkedList();
// 		System.out.print("Merged mergeTwoSortedLinkedLists result: "+res.mergeTwoSortedLinkedLists(l1, l2));
        res = res.mergeTwoSortedLinkedLists(l1, l2);
		res.display();
	   // System.out.println(l.midOfLinkedList());
	   // l.addLast(11);
	   // System.out.println(l.midOfLinkedList());
	   // System.out.println(l.kthElementFromLast(2));
	   // System.out.println(l.kthElementFromLast(3));
	   // System.out.println(l.kthElementFromLast(10));
	   // l.addFirst(-11);
	   // l.display();
	   // l.addAtIndex(1, -12);
	   // l.display();
	   // l.addAtIndex(0, -13);
	   // l.display();
	   // l.addAtIndex(7, -13);
	   // l.display();
	   // l.addAtIndex(9, -33);
	   // l.display();
	   // l.addAtIndex(10, -13);
	   // l.display();
	   // l.addAtIndex(100, -13);
	   // l.display();
	    
	    
	   // l.reverseDI();
	   // l.display();
	    
	   // l.reverseDI();
	   // l.display();
	    
	   // l.reversePI();
	   // l.display();
	    
	   // l.removeAt(0);
	   // l.display();
	    
	   // l.removeAt(1);
	   // l.display();
	    
	   // l.removeAt(5);
	   // l.display();
	}
}