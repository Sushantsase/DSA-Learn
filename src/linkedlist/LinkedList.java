package linkedlist;

public class LinkedList {
    private class Node {
        int data = 0;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        addFirstNode(node);
    }

    private void addFirstNode(Node node) {
        if (this.size == 0) {
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        addLastNode(node);
    }

    private void addLastNode(Node node) {
        if (this.size == 0) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void addAt(int idx, int data) {
        if (idx < 0 || idx > this.size) {
            return;
        }
        Node node = new Node(data);
        addNodeAt(node, idx);
    }

    private void addNodeAt(Node node, int idx) {
        if (idx == 0) {
            addFirstNode(node);
        } else if (idx == this.size) {
            addLastNode(node);
        } else {
            Node prevNode = getNodeAt(idx - 1);
            Node forwardNode = prevNode.next;

            prevNode.next = node;
            node.next = forwardNode;
            this.size++;
        }
    }

    public int getFirst() {
        if (this.size == 0) {
            System.out.println("Empty LL");
            return -1;
        }
        Node node = getFirstNode();
        return node.data;
    }

    private Node getFirstNode() {
        return this.head;
    }

    public int getlast() {
        if (this.size == 0) {
            return -1;
        }
        Node node = getLastNode();
        return node.data;
    }

    private Node getLastNode() {
        return this.tail;
    }

    public int getAt(int idx) {
        if (idx < 0 || idx >= this.size) {
            return -1;
        }
        return getNodeAt(idx).data;

    }

    private Node getNodeAt(int idx) {
        Node current = this.head;
        while (idx-- > 0) {
            current = current.next;
        }
        return current;

    }

    public int removeFirst() {
        if (this.size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }
        Node node = removeFirstNode();
        return node.data;
    }

    private Node removeFirstNode() {
        Node node = this.head;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
            node.next = null;

        }
        this.size--;
        return node;
    }

    public int removeLast() {
        if (this.size == 0)
            return -1;
        return removeLastNode().data;
    }

    private Node removeLastNode() {
        Node node = this.head;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            Node secondLastNode = getNodeAt(this.size - 2);
            secondLastNode.next = null;
            this.tail = secondLastNode;
        }
        this.size--;
        return node;
    }

    public int removeAt(int idx) {
        if (idx < 0 || idx >= this.size) return -1;
        return removeNodeAt(idx).data;
    }

    private Node removeNodeAt(int idx) {
        if (idx == 0) {
            return removeFirstNode();
        } else if (idx == this.size) {
            return removeLastNode();
        } else {
            Node prevNode = getNodeAt(idx - 1);
            Node node = prevNode.next;
            Node forwardNode = node.next;

            node.next = null;
            prevNode.next = forwardNode;
            this.size--;

            return node;
        }

    }

    //Two Pointer approach
    public Node midOfLinkedList(Node node) {
        if (node == null || node.next == null) return node;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isCircular() {
        if (head == null) return false;

        Node firstNode = head;
        Node lastNode = head;

        while (firstNode != null && firstNode.next != null) {
            lastNode = lastNode.next;
            firstNode = firstNode.next.next;
            if(lastNode==firstNode){
                return true;
            }
        }
        return false;
    }

    public void reverse() {
        if (this.size == 0) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node previous = null;
        Node next = null;
        Node current = this.tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();


    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
