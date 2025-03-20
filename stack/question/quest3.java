package stack.question;

import java.util.Stack;

// valid paranthesis
public class quest3 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();


        for( char ch : s.toCharArray()){
            if( ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(ch == ')'){
                    if( stack.isEmpty() || stack.pop() != '(' ){
                        return false;
                    }
                }
                if(ch == '}'){
                     if( stack.isEmpty() || stack.pop() != '{' ){
                        return false;
                    }
                }
                if( ch == ']'){
                     if( stack.isEmpty() || stack.pop() != '[' ){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
