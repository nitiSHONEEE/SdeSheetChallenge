import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		
               for(int i=0;i<n;i++)
        {
            int count=1;
             for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        }
            if(count>n/2){
                return arr[i];
            }
            
        }
        return -1;
    
	}
}
