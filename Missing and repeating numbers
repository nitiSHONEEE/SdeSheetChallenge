import java.util.ArrayList;
import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        
        int []a=new int [2];   
            for(int i=1;i<=n;i++)
            {
                if(!arr.contains(i))
                {
                    a[0]=i;
                }
               if( Collections.frequency(arr, i)>1)
               {
                   a[1]=i;
               }
            }
    
        return a;
    }
}
