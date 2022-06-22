import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
          ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix.get(i).size();j++)
            {
                al.add(matrix.get(i).get(j));
            }
            
        }

        
         Collections.sort(al);
        int n = al.size();
        if(al.size()%2!=0)
        {
            return al.get(n/2);
        }
        int a = al.get((n/2)-1);
        int b = al.get((n/2));

        return (a+b)/2;
	}
}
