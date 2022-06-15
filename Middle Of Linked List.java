import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
           Node[] Nodee = new Node[1000000];
        int i = 0;
        while (head != null) {
            Nodee[i++] = head;
            head = head.next;
        }
        return Nodee[i / 2];
        
    }
}
