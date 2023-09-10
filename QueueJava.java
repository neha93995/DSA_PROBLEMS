import java.util.*;
import java.util.LinkedList;

public class QueueJava {
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        //insert element 

        for(int i=0; i<10; i++)
        {
            q.add(i);
            s.push(i);
        }
        
        // display queue
        System.out.println(q);
        System.out.println(s);
        q.add(1111);
        s.push(111111);
        System.out.println("====="+q.peek());
        System.out.println(s.peek());
        // System.out.println(q.remove());
        // System.out.println(s.pop());
        // System.out.println(q.remove());
        // System.out.println(s.pop());

        System.out.println(q.poll());

        // check top element of the queue

        System.out.println("top element " + q.peek());
        
        // delete element 
        
        q.remove();
        
        // check top element of the queue after deletion 

        System.out.println("top element after deletion  " + q.peek());
        System.out.println("top element after deletion  " + q.isEmpty());

    }
}
