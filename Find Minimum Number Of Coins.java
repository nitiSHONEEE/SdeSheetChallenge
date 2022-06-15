// Using Greedy Method
public class Solution
{
public static int findMinimumCoins(int amount)
    {
            
           int nums[]={1,2,5,10,20,50,100,500,1000};
        if(amount==0)
        {
            return 0;
        }
        int c=-1;
        int res=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<=amount)
            {
                
                 c= (int)Math.floor(amount/nums[i]);
                res=res+c;
                amount =amount-nums[i]*c;
                 if(amount==0)
            {
                break;
            }
            }
        }
        
        if(amount!=0)
        {
            
            
            return -1;
            
        }
        return res;
    
            
    }
}
