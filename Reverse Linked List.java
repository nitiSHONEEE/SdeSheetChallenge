import java.util.* ;
import java.io.*; 

public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        
         ArrayList<Integer> al= new ArrayList<>();
        LinkedListNode <Integer> cur=head;
        while(cur!=null)
        {
            al.add(cur.data);
            cur=cur.next;
        }
         LinkedListNode <Integer> curr=head;
        
        for(int i=al.size()-1;i>=0;i--)
        {
            curr.data=al.get(i);
            curr= curr.next;
        }
        return head;
    }
}
