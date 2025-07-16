import java.util.*;


public class ReverseLinkedListDataIterative
{
    
    public static class Node{
        int data;
        Node next;
}

    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        
    private Node getNodeAt(int idx){
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp;
    }
    //This function is written such that Linked list is reversed using only data part and not with next part
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
		List<Integer> lst = new ArrayList<>();
		while (sc.hasNextInt()) {
		    int i = sc.nextInt();
		    lst.add(i);
		}

		LinkedList l = new LinkedList();
		for(int i = 0;i<lst.size();i++){
		    l.addLast(lst.get(i));
		}
		
		System.out.println(l.getAt(0));
		System.out.println(l.getAt(1));
	    l.display();
	    l.addFirst(-11);
	    l.display();
	    l.addAtIndex(1, -12);
	    l.display();
	    l.addAtIndex(0, -13);
	    l.display();
	    l.addAtIndex(7, -13);
	    l.display();
	    l.addAtIndex(9, -33);
	    l.display();
	    l.addAtIndex(10, -13);
	    l.display();
	    l.addAtIndex(100, -13);
	    l.display();
	    
	    
	    l.reverseDI();
	    l.display();
	    
	    l.reverseDI();
	    l.display();
	}
}