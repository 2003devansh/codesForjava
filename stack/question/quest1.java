// https://leetcode.com/problems/implement-queue-using-stacks/

package stack.question;

import java.util.Stack;

import recursion.rec;

/**
 * quest1
 */
public class quest1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
       stack.push(5);

       System.out.println(stack.pop());
    }
}

class MyQueue{

    private Stack<Integer> first;
    private Stack<Integer> second;



    public MyQueue(){
        first = new Stack<>(); // first stack
        second = new Stack<>(); // second stack
    }

    public void push(int item){
        first.push(item);
    }

    public int pop(){
       while (!first.isEmpty()) {
         second.push(first.pop());
       }
        // remove from first and put it in second
        int remove = second.pop(); 
        // the removed item will be the in top of the second stack
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return remove;
    }

    public int peek(){
         while (!first.isEmpty()) {
         second.push(first.pop());
       }
        // remove from first and put it in second
        int peeked = second.peek(); 
        // the removed item will be the in top of the second stack
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;

    }

    public boolean empty(){
        return first.isEmpty();
    }
}
