package queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ques {
    public static void main(String[] args) {
        Queue<Integer> queue = new  LinkedList<>();

        queue.add(4);
        queue.add(6);
        queue.add(687);
        queue.add(656);
        queue.add(645);
        queue.add(566);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
            
     // queue  impliment first in first out so 4 will be remove first and 566 at last

     // ArrayDeque :- 
     Deque<Integer> deque = new ArrayDeque<>();
     deque.add(76);
     deque.add(89);
     deque.addLast(98);
     deque.add(78);

     // arraydeque class basically create to object of the methods of deques like... add ,adlast
     // remove
     //in deque we can insert from first and last also and delete from first and last also
     // by using the  methods
    }
}
