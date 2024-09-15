package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Element : "+q);
        System.out.println(q.poll());
        q.add(2);
        System.out.println("Element : "+q);
q.remove();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Element : "+q);
        q.remove();
        System.out.println("Peek "+q.peek());

        System.out.println("Eleemt "+q.element());

        System.out.println("Poll "+q.poll());
        System.out.println("Poll "+q.poll());
        System.out.println("Poll "+q.poll());
        System.out.println("After Poll : "+q);

    }
}
