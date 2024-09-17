package linkedlist;

public class client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll.getSize());
        System.out.println(ll.isEmpty());
        ll.addFirst(2);
        System.out.println(ll.getSize());
        ll.addFirst(2);
        System.out.println(ll.getSize());
        ll.addLast(5);
        System.out.println(ll.getSize());
        ll.display();
        ll.removeFirst();
        ll.display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getlast());
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);

        ll.display();
        System.out.println("Size: " + ll.getSize());
        ll.removeFirst();
        System.out.println(ll.getAt(5));
        ll.display();
        ll.removeLast();
        ll.addAt(2,10);
        ll.removeAt(1);
        ll.display();
        System.out.println(ll.isCircular());
       // ll.midOfLinkedList()
        //System.out.println(ll.midOfLinkedList());
    }
}
