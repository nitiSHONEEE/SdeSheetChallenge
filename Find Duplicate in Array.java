import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){ 
        HashSet<Integer> Set=new HashSet<>();
        
       for(int i:arr)
       {
        
           if(Set.contains(i))
              {
                    return i;
              }
           else
             {
                Set.add(i);
             }
       }
       return -1;
    }
}
