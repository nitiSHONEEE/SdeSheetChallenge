import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
      List<Integer> zero=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        List<Integer> two=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero.add(arr[i]);
            }else if(arr[i]==1) {
                one.add(arr[i]);
            }else if(arr[i]==2){
                two.add(arr[i]);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.addAll(zero);
        res.addAll(one);
        res.addAll(two);
        
        for(int i=0;i<arr.length;i++){
            arr[i]=res.get(i);
        }
    }
}
