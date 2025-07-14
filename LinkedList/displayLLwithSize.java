import java.util.*;


public class displayLLwithSize
{
    
    public static class Node{
        int data;
        Node next;
}

    public static class LinkedList{
        Node head;
        Node tail;
        int size;
    
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
	    l.display();
	    l.sizeofLinkedList();
	}
}