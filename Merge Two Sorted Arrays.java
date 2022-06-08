import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int []a=new int [m+n];
        for(int i=0;i<m;i++)
        {
            a[i]=arr1[i];
        }
        
         for(int i=0;i<n;i++)
        {
            a[m++]=arr2[i];
        }
        
        Arrays.sort(a);
        return a;
    }
}
