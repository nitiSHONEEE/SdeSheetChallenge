import java.util.* ;
import java.io.*; 

public class Solution {
       static Boolean matching(char a,char b)
    {
        return ((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}'));
    }
    public static boolean isValidParenthesis(String s) {
    
        Stack <Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                stack.push(s.charAt(i));
                
            }
            else
            {
                if(stack.empty())
                {
                    return false;
                }
                else if(matching(stack.peek(),s.charAt(i))==false)
                {
                    return false;
                }
                else
                    stack.pop();
                    
            }
            
            
        }
        return stack.empty();
    }
 
}
