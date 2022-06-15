import java.util.* ;
import java.io.*; 
/*  

    Following is the representation of the Singly Linked List node

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

*/

public class Solution {
    
    public static boolean detectCycle(Node<Integer> head) {
        //Your code goes here
         HashSet <Node> hs= new HashSet<>();
        while(head!=null)
        {
            if(!hs.contains(head))
            {
                hs.add(head);
                head=head.next;
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
}
