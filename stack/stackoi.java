package stack;

import java.util.Stack;

public class stackoi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(3);
        stack.push(93);
        stack.push(63);
        stack.push(78);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //works on first in last out appraoch so 78 will comme out first and 23 wil come out last


    }
}
