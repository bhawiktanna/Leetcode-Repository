import java.util.*;
public class createGenericTree
{
    private class Node{
        int data;
        ArrayList<Node> children = new ArrayList<Node>();
        
        public void createGenericTree(int[] arr){
            Stack<Node> st = new Stack<>();
            Node root;
            for(int a : arr){
                if(a == -1){
                    st.pop();
                }
                else{
                    Node temp = new Node();
                    temp.data = a;
                    if(st.size > 0){
                        st.peek().children.push(temp);
                        st.push(temp);
                    }
                    else{
                        root = temp;
                    }
                    st.push(temp)
;                }
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}