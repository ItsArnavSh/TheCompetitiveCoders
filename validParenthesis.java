/* 
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/
import java.util.*;
class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                char k = s.charAt(i)=='('?')':s.charAt(i)=='{'?'}':']';
                stack.push(k);
            }
            else if((s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'))
            {
                if(stack.size()==0)
                    return false;
                if(stack.peek()==s.charAt(i)){
                    stack.pop();
                    }
                else 
                    return false;
            }
        }
        if(stack.size()==0)
        return true;
        return false;
    }
}